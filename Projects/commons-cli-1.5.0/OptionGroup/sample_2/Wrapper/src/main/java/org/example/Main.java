package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commonscli.OptionGroup;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class Main {
    public static void main(String[] args) {
        // create Options
        Options options = new Options();
        
        // add option without group
        options.addOption(Option.builder("f")
                               .argName("file")
                               .longOpt("file")
                               .numberOfArgs(1)
                               .valueSeparator()
                               .desc("specify a file")
                               .build());
        
        // add option group
        OptionGroup group = new OptionGroup();
        group.addOption(Option.builder("v")
                               .longOpt("verbose")
                               .desc("print more info")
                               .build());
        group.addOption(Option.builder("q")
                               .longOpt("quiet")
                               .desc("print less info")
                               .build());
        options.addOptionGroup(group);
        
        // create the parser
        CommandLineParser parser = new PosixParser();
        
        // parse the command line arguments
        CommandLine line = parser.parse(options, args);
        
        if (line.hasOption("f")) {
            System.out.println("File: " + line.getOptionValue("f"));
        }
        
        // print help when no argument or -h
        if (args.length == 0 || line.hasOption("h")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("Main", options);
            System.exit(0);
        }
        
        // check if 'verbose' option is present
        if (line.hasOption("v")) {
            System.out.println("Verbose!");
        }
        
        // check if 'quiet' option is present
        if (line.hasOption("q")) {
            System.out.println("Quiet!");
        }
    }
}