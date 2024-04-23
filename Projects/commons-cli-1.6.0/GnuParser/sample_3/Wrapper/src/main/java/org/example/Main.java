package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.GnuParser;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        CommandLineParser parser = new GnuParser();

        Options options = new Options();
        options.addOption(new Option("n", "name", true, "Name of the user"));
        options.addOption(new Option("a", "age", true, "Age of the user"));

        CommandLine cmd = parser.parse(options, args);

        String name = cmd.getOptionValue("n");
        String age = cmd.getOptionValue("a");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}