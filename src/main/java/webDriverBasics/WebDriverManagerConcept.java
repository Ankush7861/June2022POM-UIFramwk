package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		String title=driver.getTitle();
		System.out.println("page title: "+title);
		
		//verification 
		if(title.equals("Google")) {System.out.println("Pass");}
		else {System.out.println("FAIL");}
		
		String source=driver.getPageSource();
		//System.out.println(source);
		if(source.contains(" Copyright The Closure Library Authors."))
		{
			System.out.println("PAss");
			}
		else {System.out.println("Fail");}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		

		driver.quit();

	}

}
