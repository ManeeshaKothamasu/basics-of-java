package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		e1.sendKeys("shoe"+Keys.ENTER);
		TakesScreenshot t1=driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		//File destination= new File("C:\\Users\\manee\\OneDrive\\Pictures\\Microsoft.Windows.Photos_8wekyb3d8bbwe!App\\ram.png");
		//File destination= new File("C:\\Users\\manee\\OneDrive\\Pictures\\Microsoft.Windows.Photos_8wekyb3d8bbwe!App\\ram"+Math.random()+".png");
		File destination= new File("C:\\Users\\manee\\OneDrive\\Pictures\\Microsoft.Windows.Photos_8wekyb3d8bbwe!App\\ram"+new Screenshot().getClass()+".png");
		//File destination= new File("C:\\Users\\manee\\OneDrive\\Pictures\\Microsoft.Windows.Photos_8wekyb3d8bbwe!App\\ram"+currenttime+".png");
		FileHandler.copy(source, destination);

	}

}
