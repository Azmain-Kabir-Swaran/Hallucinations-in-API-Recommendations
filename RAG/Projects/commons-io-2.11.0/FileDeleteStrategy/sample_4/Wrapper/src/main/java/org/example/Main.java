package org.example;


import org.apache.commons.io.FileDeleteStrategy;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("path_to_your_file");

        FileDeleteStrategy strategy = FileDeleteStrategy.FORCE;
        strategy.delete(file);
    }
}