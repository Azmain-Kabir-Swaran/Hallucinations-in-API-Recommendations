package org.example;


import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        PosixParser parser = new PosixParser();

        List options = new ArrayList<>();
        options.add(OptionBuilder.withArgName("argument").hasArg().withDescription("Test argument").create('a'));
        options.add(OptionBuilder.withArgName("another argument").hasArg().withDescription("Another test argument").create('b'));

        CommandLine commandLine = parser.parse(options, args, true);

        if(commandLine.hasOption('a')) {
            String arg = commandLine.getOptionValue('a');
            System.out.println("Argument 'a' is: " + arg);
        }
        
        if(commandLine.hasOption('b')) {
            String arg = commandLine.getOptionValue('b');
            System.out.println("Argument 'b' is: " + arg);
        }
    }
}