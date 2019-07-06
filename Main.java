import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.LogManager;
public class Main {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {

        System.out.println("Hello World!");
        logger.info("Hello, World!");
        logger.debug("Here is some DEBUG");
        logger.info("Here is some INFO");
        logger.warn("Here is some WARN");
        logger.error("Here is some ERROR");
        logger.fatal("Here is some FATAL");
    }
}
