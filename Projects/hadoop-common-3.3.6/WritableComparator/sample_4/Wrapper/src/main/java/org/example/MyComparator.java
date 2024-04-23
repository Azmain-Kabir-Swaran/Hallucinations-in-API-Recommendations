package org.example;

import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.WritableComparator;

public class MyComparator extends WritableComparator {
    public MyComparator() {
        super(ByteWritable.class, true);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
        // your comparison logic here
        return 0;
    }
}