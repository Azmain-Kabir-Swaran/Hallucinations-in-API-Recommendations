package org.example;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.CommandLine;
import org.apache.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {
        Options options = new Options();

        options.addOption(
                OptionBuilder.withLongOpt("option1")
                        .withDescription("Option 1 description")
                        .withArgName("arg1")
                        .isRequired(true)
                        .hasArg(true)
                        .create('o')
        );

        CommandLineParser parser = new PosixParser();
        try {
            CommandLine line = parser.parse(options, args);
            if (line.hasOption('o')) {
                System.out.println("Option 'option1' found: " + line.getOptionValue('o'));
            }
        } catch (ParseException exp) {
            System.out.println(exp.getMessage());
        }
    }
}