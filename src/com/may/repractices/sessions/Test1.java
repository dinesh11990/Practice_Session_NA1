package com.may.repractices.sessions;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("divpaxinfo")).click();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (WebElement webElement : products.size()) {

			if (webElement.getText().equals("Cucumber")) {
				
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
		}

	}

}
