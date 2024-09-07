package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCategory {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-content']/ul/li[1]")).click();

	}

}
