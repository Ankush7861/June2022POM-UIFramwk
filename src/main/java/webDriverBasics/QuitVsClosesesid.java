package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClosesesid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("title is : "+title);
		
		if(title.equals("Google")) {System.out.println("pass");}
		else {System.out.println("Fail");}
		
	  String url=driver.getCurrentUrl();
	  System.out.println("url is : "+url);
	  driver.close();//org.openqa.selenium.NoSuchSessionException: invalid session id
	  //driver.quit(); // org.openqa.selenium.NoSuchSessionException: Session ID is null.
	  
	  String title1=driver.getTitle();
		System.out.println("title is : "+title1);
	}

}
