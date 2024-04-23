package org.example;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class Main extends WritableComparator {

    protected Main() {
        super(Text.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return ((Text) a).compareTo((Text) b);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Main main = new Main();
        Text a = new Text("b");
        Text b = new Text("a");

        int result = main.compare(a, b);

        if (result > 0)
            System.out.println(a + " is greater than " + b);
        else if (result < 0)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println(a + " is equal to " + b);
    }
}