package com.Testng_Demo;

import org.testng.annotations.Test;

public class Exception_Test {

	@Test(expectedExceptions = ArithmeticException.class)
	private void test_Data() {

		System.out.println(10 / 0);

	}

}
