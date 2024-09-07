package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginAmazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
		//Actions a1=new Actions(driver);
		//a1.moveToElement(e1).perform();
		//WebElement e2=driver.findElement(By.xpath("//*[text()='Sign in']"));
		e1.click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("maneesha");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("zxcvba");
		driver.findElement(By.id("signInSubmit")).click();
		

	}

}
