package cn.tac.test.spring.boot.logging.runnner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author tac
 * @since 02/11/2017
 */
public class LevelLoggingRunner implements ApplicationRunner {
    public static final String SPLITTER = "------------------------------------";
    private static Logger loggerString= LoggerFactory.getLogger(String.class);
    private static Logger loggerInteger = LoggerFactory.getLogger(Integer.class);

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        loggerString.info("info from java.lang.String");
        loggerInteger.info("this log will not output");
    }
}
