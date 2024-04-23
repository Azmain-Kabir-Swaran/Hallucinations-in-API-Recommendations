package org.example;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commonscl<>i.OptionBuilder;

public class Main {
    public static void main(String args[]) {
        Options options = new Options();
        options.addOption(OptionBuilder.withArgName("file")
                .hasArgs()
                .withDescription("File to process")
                .create('f'));

        // Here you can add more options using OptionBuilder

        // Now, let's parse the options:
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(options, args);
            if (line.hasOption('f')) {
                System.out.println("Processing file: " + line.getOptionValue('f'));
            }
        } catch (ParseException exp) {
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
        }
    }
}