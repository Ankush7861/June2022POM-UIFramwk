package webDriverBasics;

import org.openqa.selenium.WebDriver;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\ChromeDriver\\chromedriver.exe");
	
		System.setProperty("webdriver.gecko.driver","E:\\Drivers\\FirefoxDriver\\geckodriver.exe");
	
		//cross browser logic 
		
		
		
		
		
	driver.get("https://www.google.com");
	
	
	
	
	}

}
