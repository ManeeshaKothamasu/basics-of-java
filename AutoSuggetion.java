package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='oBHEnb']/ul/li"));
		l1.get(1).click();
	
		

	}

}
