package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.xpath("//div[@class='a4bIc']/textarea"));
		e1.sendKeys("India"+Keys.ENTER);

	}

}
