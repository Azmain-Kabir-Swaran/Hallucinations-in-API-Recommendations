package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("o", "option", true, "Some option");

        CommandLineParser parser = new DefaultParser();

        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println("Cannot parse the command line: " + e.getMessage());
            return;
        }

        try {
            String value = commandLine.getOptionValue("o");

            System.out.println("Value of the option: " + value);

            // Do something with the value
        } catch (MissingOptionException e) {
            System.out.println("Missing option: " + e.getMissingOption());
        }
    }
}