package org.example;


import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.WritableComparable;

public class Main {
    public static void main(String[] args) {
        WritableComparator.setDefault(MyWritableComparator.class);
    }
}