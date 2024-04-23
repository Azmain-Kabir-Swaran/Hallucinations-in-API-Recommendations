package org.example;


import java.util.Formatter;
import org.apache.commons.cli.DefaultHelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class Main {
    
    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        DefaultHelpFormatter helpFormatter = new DefaultHelpFormatter();

        Options options = new Options();
        options.addOption("a", "test", false, "help for test");

        Option opt = options.getOption("a");

        String helpMessage = helpFormatter.formatHelp(opt);

        formatter.format("%s", helpMessage);
        formatter.close();
    }
}