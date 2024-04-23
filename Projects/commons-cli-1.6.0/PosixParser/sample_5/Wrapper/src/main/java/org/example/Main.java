package org.example;


import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;

public class Main {

    public static void main(String[] args) throws Exception {
        Options options = new Options();
        options.addOption("o", false, "option o");
        options.addOption("f", true, "option f arg");

        CommandLineParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption('o')) {
            System.out.println("Option o has been entered.");
        }
        if (cmd.hasOption('f')) {
            System.out.println("Option f has been entered, with value: " + cmd.getOptionValue('f'));
        }
    }
}