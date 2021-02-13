package com.Testng_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parrallel_DEmo {

	public static WebDriver driver;

	@Test
	private void facebook() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Test
	private void amazon() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	@Test
	private void myntra() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");

	}

}
