package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.LogManager;

public class Main {
    static org.apache.logging.log4j.core.LoggerContext ctx = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
    static org.apache.logging.log4j.core.config.Configuration config = ctx.getConfiguration();
    static org.apache.logging.log4j.core.config.LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);

    public static void main(String[] args) {
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(Main.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
    }
}