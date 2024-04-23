package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("a", false, "Help message a");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("a")) {
                System.out.println("Option a specified");
            } else {
                System.out.println("Option a not specified");
            }

        } catch (ParseException e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }
    }
}