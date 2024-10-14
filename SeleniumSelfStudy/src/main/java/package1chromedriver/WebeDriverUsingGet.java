package package1chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeDriverUsingGet {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		//In get we dont have options to go back to previous window tab since cache is not stored
		System.out.println("The tab title of flikart is " +driver.getTitle());
		System.out.println("The current url of tab is " +driver.getCurrentUrl());
		
	}

}
