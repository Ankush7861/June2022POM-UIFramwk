package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Svgele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(3000);
		String map_xpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']"; 
		List<WebElement> stateList=driver.findElements(By.xpath(map_xpath));
		
		System.out.println(stateList.size());
		for(WebElement e:stateList) 
		{
			String iDval=e.getAttribute("id");
			System.out.println(iDval);
		}

	}

}
