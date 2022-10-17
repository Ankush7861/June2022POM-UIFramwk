package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gogleSearch {
  static WebDriver driver;
  
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		driver.get("http://automationpractice.com/");
		//gogleSearch.googleSearchb(text, "selenium");
		By searchKey=By.name("search_query");
		By suggestions=By.xpath("//div[@class='wM6W7d']/span");
		googleSearchb(searchKey, "dress",searchKey,"Casual dress");
		
		

	}
	public static List<WebElement> getElements(By Locator){
		return driver.findElements(Locator);
		
	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static void googleSearchb(By searchLocator,String searchKey,By suggLocator,String value) throws InterruptedException {
		//driver.findElement(By.name("q")).sendKeys("selenium");
		getElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);
		
		List<WebElement> suggList= getElements(suggLocator);
		System.out.println(suggList.size()-1);
		for(WebElement e:suggList) {
		 String text=e.getText();
		 System.out.println(text);
		 if(text.equals(value)) {
			 e.click();
			 break;
		 }
		}
	}

}
