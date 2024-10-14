package package1chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUsingNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://flipkart.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://ebay.com");
		driver.manage().window().maximize();
		//if we want to open in new different windows
		/*WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://ebay.com");
		driver1.manage().window().maximize();*/
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("When back method given the url is "+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("When forward method given the url is "+driver.getCurrentUrl());
		//driver.close();



	}

}
