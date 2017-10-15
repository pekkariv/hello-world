package hello.world;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMain {

	private static final Logger logger = LogManager.getLogger("HelloWorld");

	public static void main(String[] args) {
		logger.info("Hello world, test main here");
	}

}
