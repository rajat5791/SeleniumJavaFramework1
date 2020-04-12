package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {


	static Logger logger = LogManager.getLogger(Log.class);

	public static void main(String[] args) {

		System.out.print("\n Hello World \n");

		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");

		System.out.print("\n Completed \n");
	}

}
