package Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.name("field-keywords"));
		if(e1.isDisplayed()&&e1.isSelected()) {
			e1.sendKeys("Shoe"+Keys.ENTER);
		}

	}

}
