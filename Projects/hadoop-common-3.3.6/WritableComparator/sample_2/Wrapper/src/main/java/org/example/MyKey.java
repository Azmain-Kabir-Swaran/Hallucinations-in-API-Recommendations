package org.example;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.WritableComparisons;

public class MyKey implements WritableComparable<MyKey> {

    private int key;

    public MyKey() {
    }

    public MyKey(int key) {
        this.key = key;
    }

    public void readFields(DataInput in) throws IOException {
        key = in.readInt();
    }

    public void write(DataOutput out) throws IOException {
        out.writeInt(key);
    }

    public int compareTo(MyKey myKey) {
        return Integer.compare(key, myKey.key);
    }

    public int getKey() {
        return key;
    }

    public static class KeyComparator extends WritableComparator {
        public KeyComparator() {
            super(MyKey.class);
        }

        @Override
        public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
            return WritableComparisons.compareBytes(b1, s1, l1, b2, s2, l2);
        }
    }
}