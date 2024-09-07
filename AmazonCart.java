package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		e1.sendKeys("mobiles"+Keys.ENTER);
		driver.findElement(By.id("a-autoid-1-announce")).click();

	}

}
