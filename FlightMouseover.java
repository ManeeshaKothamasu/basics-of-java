package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlightMouseover {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__inner'])[3]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement w1=driver.findElement(By.xpath("(//a[@class='elementor-flip-box_button elementor-button elementor-size-sm'])[2]"));
		w1.click();
	}

}
