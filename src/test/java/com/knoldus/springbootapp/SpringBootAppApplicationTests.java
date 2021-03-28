package com.knoldus.springbootapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class SpringBootAppApplicationTests {

	@Test
	void contextLoads() {
		RunningCurrentDateController runningCurrentDateController = new RunningCurrentDateController();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
		String expected = "Running, {"+LocalTime.now().format(dtf)+"}";
		Assertions.assertEquals(expected,runningCurrentDateController.showRunning());
	}

}
