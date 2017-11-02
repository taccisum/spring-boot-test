package cn.tac.test.spring.boot.logging.runnner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author tac
 * @since 02/11/2017
 */
public class LoggingRunner implements ApplicationRunner {
    public static final String SPLITTER = "------------------------------------";
    private static Logger logger = LoggerFactory.getLogger(LoggingRunner.class);

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.info(SPLITTER);
        logger.info("this is an info message");
        logger.info(SPLITTER);
    }
}
