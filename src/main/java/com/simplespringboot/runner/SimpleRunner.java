package com.simplespringboot.runner;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;

/**
 * @author zhangke
 * @date 2018-01-05.
 */
public class SimpleRunner implements CommandLineRunner {

	private static final Logger LOGGER = Logger.getLogger(SimpleRunner.class);

	@Override
	public void run(String... strings) throws Exception {
		LOGGER.info("hello first Runner");
	}
}
