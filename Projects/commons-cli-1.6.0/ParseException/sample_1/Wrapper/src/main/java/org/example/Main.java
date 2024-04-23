package org.example;


import org.apache.commons.cli.*;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String[] args) {
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption(Option.builder("t")
                .longOpt("type")
                .desc("Set Type")
                .hasArg()
                .argName("arg")
                .build()
        );

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;
        try {
            // parse the command line arguments
            cmd = parser.parse(options, args);

            if (cmd.hasOption("t")) {
                // output the argument value to the console.
                System.out.println(cmd.getOptionValue("t"));
            }
        } catch (ParseException exp) {
            // oops, something went wrong
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
        }
    }
}