package hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
	
	static Logger logger = Logger.getLogger(Hello.class.getName());
	
	public static void main(String[] args) {
		logger.log(Level.INFO,"Hello, everybody");
	}
}
