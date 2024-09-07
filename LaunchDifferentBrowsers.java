package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchDifferentBrowsers {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	EdgeDriver driver1=new EdgeDriver();
	driver1.get("https://www.google.com");
	

	}

}
