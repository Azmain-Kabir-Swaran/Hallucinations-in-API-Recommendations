package org.example;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {

  public static void main(String[] args) {
    CommandLine cmd = null;
    CommandLineParser parser = new DefaultParser();
    Options options = new Options();

    Option opt = new Option("h", "help", false, "show help.");
    options.addOption(opt);

    Option argOpt = new Option("o", "output", true, "output file");
    argOpt.setArgName("file");
    options.addOption(argOpt);

    try {
      cmd = parser.parse(options, args);
    } catch (ParseException e) {
      System.out.println(e.getMessage());
      System.out.println("use -h for help");
      return;
    }

    if (cmd.hasOption('h')) {
      printHelp(options);
      return;
    }

    if (cmd.hasOption("o")) {
      String filename = cmd.getOptionValue("o");
      // do something with the filename
    } else {
      System.out.println("Missing file option");
    }
  }

  private static void printHelp(Options options) {
    for (Option opt : options.getOptions()) {
      System.out.println("-" + opt.getOpt() + ",--" + opt.getLongOpt() + "\t" + opt.getDescription());
    }
  }
}