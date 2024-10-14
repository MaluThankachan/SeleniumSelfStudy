package package1chromedriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
	
		

	}

}
