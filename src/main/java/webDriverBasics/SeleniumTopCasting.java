package webDriverBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) {
		//1.valid
		//ChromeDriver driver= new ChromeDriver();
		
		//2.valid
		//WebDriver driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		//driver = new SafariDriver();
		//driver = new EdgeDriver();
		
		//3.Valid but not useful
		//SearchContext driver= new ChromeDriver();
		
		//4.Valid and useful -> we dont use because we want to implement own business logic 
		//RemoteWebDriver driver =new ChromeDriver();
		
		//5.WD- RWD : valid and useful 
		// to run test cases on remote machine --cloud, server, grid, aws
		//WebDriver driver = new RemoteWebDriver(new URL("https://192.190.10.11/wd/hub"), capabilities);
		
	}

}
