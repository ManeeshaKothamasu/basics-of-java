package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMItNDTyuewiAMVC6RmAh1_4x6LEAAYASAAEgIp9fD_BwE");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("mobiles"+Keys.ENTER);

	}

}
