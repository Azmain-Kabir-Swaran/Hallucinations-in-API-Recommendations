package org.example;


import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();
        
        Option input = new Option("i", "input", true, "input file");
        input.setRequired(true);
        options.addOption(input);
        
        Option help = new Option("help", "print this message");
        options.addOption(help);
        
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        
        try {
            org.apache.commons.cli.CommandLine line = parser.parse(options, args);

            if (line.hasOption("help")) {
                formatter.printHelp("utility-name", options);
                System.exit(0);
            }

            if (line.hasOption("i")) {
                System.out.println("Input file is " + line.getOptionValue("i"));
            }
            
        } catch (ParseException exp) {
            System.out.println("Unexpected exception:" + exp.getMessage());
        }
    }
}