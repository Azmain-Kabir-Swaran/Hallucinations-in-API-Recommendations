package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    // Define the options for the command line interface
    public static Options createOptions() {
        Options options = new Options();
        options.addOption("a", "arg", true, "an argument");
        options.addOption("o", "opt", false, "an optional option");
        return options;
    }

    public static void main(String[] args) {
        Options options = createOptions();

        // Create the parser
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            // Parse the command line arguments
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }

        // Process the parsed arguments
        if (cmd.hasOption("arg")) {
            System.out.println("Argument given: " + cmd.getOptionValue("arg"));
        } else {
            System.out.println("No argument provided");
        }

        if (cmd.hasOption("opt")) {
            System.out.println("Option provided: -o");
        } else {
            System.out.println("Option not provided: -o");
        }
    }
}