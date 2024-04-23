package org.example;

import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.WritableComparable;

public class MyWritableComparator extends WritableComparator {
    public MyWritableComparator(Class<? extends WritableComparable> c) {
        super(c);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1,
                       byte[] b2, int s2, int l2) {
        // Your comparison logic goes here.
        return 0;
    }
}