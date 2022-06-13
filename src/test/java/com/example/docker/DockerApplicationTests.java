package com.example.docker;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(DockerApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Cases executing...");
		assertEquals(true, true);
	}

}
