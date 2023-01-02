package utilis;

import org.apache.log4j.Logger;

public class Logs {
    private final static Logger logger = Logger.getLogger(Logs.class);

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
