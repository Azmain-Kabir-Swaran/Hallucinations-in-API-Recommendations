package org.example;


import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cl<>i.CommandLineParser;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

public class Main {
    public static void main(String[] args) {
        CommandLineParser parser = new BasicParser();

        Options options = new Options();

        options.addOption(OptionBuilder.withArgName("filename")
                                     .hasArg()
                                     .isRequired()
                                     .withDescription("input filename")
                                     .create('f'));

        options.addOption(OptionBuilder.withArgName("output filename")
                                     .hasArg()
                                     .withDescription("output filename")
                                     .create('o'));

        try {
            CommandLine cmd = parser.parse(options, args);

            String inputFilename = cmd.getOptionValue('f');
            String outputFilename = cmd.getOptionValue('o');

            System.out.println("Input filename is " + inputFilename);
            System.out.println("Output filename is " + outputFilename);
        }
        catch (ParseException exp) {
            System.err.println(exp.getMessage());
        }
    }
}