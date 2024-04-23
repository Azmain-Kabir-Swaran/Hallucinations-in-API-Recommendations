package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.HelpFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        // define option: name="g", no argument
        options.addOption(Option.builder("g").longOpt("get").desc("get option description").build());

        // create the parser
        CommandLineParser parser = new DefaultParser();
        // parse the command line arguments
        CommandLine line = parser.parse(options, args);

        // print help when no arguments were passed
        if (line.getOptions().length == 0) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("Main", options);
        } else {
            System.out.println("Options were passed.");
        }
    }
}