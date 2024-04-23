package org.example;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyReducer extends Reducer<MyKey, MyValue, MyKey, MyValue> {
    // Your implementation here
}