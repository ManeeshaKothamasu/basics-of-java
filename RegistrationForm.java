package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.findElement(By.id("firstName")).sendKeys("reret");
		driver.findElement(By.id("lastName")).sendKeys("klikj");
		driver.findElement(By.id("email")).sendKeys("abc@hjh.com");
		driver.findElement(By.id("phone")).sendKeys("1234567898");
		WebElement drp=driver.findElement(By.id("gender"));
		Select opt=new Select(drp);
		opt.selectByIndex(1);
		WebElement drp1=driver.findElement(By.id("state"));
		Select opt1=new Select(drp1);
		opt1.selectByValue("andhraPradesh");
		driver.findElement(By.id("aadhaar")).sendKeys("123456789098");
		driver.findElement(By.id("pan")).sendKeys("FGHTH1236L");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("Submit")).click();

	}

}
