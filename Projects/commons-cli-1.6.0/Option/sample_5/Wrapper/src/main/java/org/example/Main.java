package org.example;


import java.io.File;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();
        
        Option option = OptionBuilder.withArgName("file")
                                    .hasArgs()
                                    .withDescription("File to read")
                                    .create("f");
        
        options.addOption(option);
        
        File file = null;
        Option temp = null;
        
        temp = options.getOption("f");
        
        if(temp.getArgName() != null) {
            file = new File(temp.getValues()[0]);
            if(file.exists()) {
                System.out.println("File found and accessible: " + file.getAbsolutePath());
            } else {
                System.out.println("File not found.");
            }
        } else {
            System.out.println("No file provided.");
        }
    }
}