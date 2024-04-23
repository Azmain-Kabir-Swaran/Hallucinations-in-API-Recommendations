package org.example;


import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption(Option.builder("v").longOpt("verbose").desc("Verbose mode.").build());
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("v")) {
                logger.info("Verbose mode is enabled.");
            } else {
                logger.info("Verbose mode is not enabled.");
            }
        } catch (ParseException exp) {
            logger.error("Unexpected exception: " + exp.getMessage());
        }
    }
}