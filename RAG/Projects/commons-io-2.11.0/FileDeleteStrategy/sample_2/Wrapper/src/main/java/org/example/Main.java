package org.example;


import org.apache.commons.io.FileDeleteStrategy;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");  // specify your file path here
        FileDeleteStrategy strategy = FileDeleteStrategy.FORCE;
        strategy.delete(file);
        if(file.exists()){
            System.out.println("File/directory deletion failed");
        } else {
            System.out.println("File/directory deleted successfully");
        }
    }
}