package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GTMRegistration {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("hghg");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("kkfg");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("Female")).click();
		WebElement drp=driver.findElement(By.id("Skills"));
		Select opt=new Select(drp);
		opt.selectByIndex(1);
		WebElement drp1=driver.findElement(By.id("Country"));
		Select opt1=new Select(drp1);
		opt1.selectByValue("Bangladesh");
		driver.findElement(By.id("Present-Address")).sendKeys("home");
		driver.findElement(By.id("Permanent-Address")).sendKeys("home1");
		driver.findElement(By.id("Pincode")).sendKeys("563987");
		WebElement drp2=driver.findElement(By.id("Relegion"));
		Select opt2=new Select(drp2);
		opt2.selectByVisibleText("Hindu");
		driver.findElement(By.id("relocate")).click();
		driver.findElement(By.name("Submit")).click();
		
		

	}

}
