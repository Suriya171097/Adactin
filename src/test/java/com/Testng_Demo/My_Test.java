package com.Testng_Demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class My_Test {

	@Test
	private void validation_Username() {

		String actual = "Sherlock";
		String expected = "Watson";

		assertEquals(actual, expected);

	}

	@Test
	private void validation_Password() {

		String actual = "Password";
		String expected = "John";

		assertEquals(actual, expected);

	}

}
