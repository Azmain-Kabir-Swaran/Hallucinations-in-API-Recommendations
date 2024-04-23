package org.example;


import java.util.Date;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();
        options.addRequiredOption("p", "property", true, "Specify the property file location");
        options.addOption("v", "verbose", false, "Print the detail log");
        
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine line = parser.parse(options, args);
            String property = line.getOptionValue("p");
            System.out.println("Specified property file location: " + property);
            
            if (line.hasOption("v")) {
                System.out.println("Detail log printed on " + new Date());
            }
        } catch (ParseException exp) {
            System.out.println("Unexpected exception:" + exp.getMessage());
            formatter.printHelp("utility-name", options);
        }
    }
}