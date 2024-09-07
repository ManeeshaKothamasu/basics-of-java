package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTagname {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.tagName("a"));
		System.out.println(e1.getSize());

	}

}
