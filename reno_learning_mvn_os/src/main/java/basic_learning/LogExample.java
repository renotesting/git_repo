package basic_learning;

//To make log4j work in Maven project:
//Add the below Maven Dependency into POM within Maven Project
//<dependency>
//	<groupId>log4j</groupId>
//	<artifactId>log4j</artifactId>
//	<version>1.2.17</version>
//</dependency>

import org.apache.log4j.Logger;

public class LogExample {
	
	private static final Logger log = Logger.getLogger(LogExample.class);
	
	public static void main(String args[]){
		log.debug("Hello world from debug");
		log.info("Hello world from info");
		log.warn("Hello world from warn");
		log.error("Hello world from error");
	}

}
