package org.example;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.WritableComparisons;

public class Main {
    public static void main(String[] args) {
        MyKey key1 = new MyKey(5);
        MyKey key2 = new MyKey(3);

        int compareResult = key1.compareTo(key2);
        System.out.println(compareResult); // Outputs: 2

        WritableComparator.setImplementation(MyKey.class, MyKey.KeyComparator.class);
        compareResult = key1.compareTo(key2);
        System.out.println(compareResult); // Outputs: 2
    }
}