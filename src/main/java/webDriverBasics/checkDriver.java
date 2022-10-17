package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\EgpAutomateCSharp\\EgpAutomateCSharp\\EgpAutomateCSharp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("page title"+title);
		driver.close();
		if(title.equals("Google")) 
		{
			 System.out.println("PASS");
			 
		}
		else
		{ 
			System.out.println("FAIL");
			}
        driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title1 =driver.getTitle();
		System.out.println("page title"+title1);
		if(title1.equals("Amazon.com. Spend less. Smile more.")) 
		{
			 System.out.println("PASS");
			 
		}
		else
		{ 
			System.out.println("FAIL");
			}
		driver.close();
		
	}

}
