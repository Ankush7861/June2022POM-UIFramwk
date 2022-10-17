package testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestAssg {
	
	//data driven approach
	//testNG dataprovider
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
			return new Object[][] {
			
			{"aptest", "ln","aptest@gmail.com","123456789","test111"}
			
		};
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginNegativeTest(String FirstName, String LastName,String Mail, String Telephone, String Password ) {
		Assert.assertEquals(doLogin(FirstName, LastName,Mail,Telephone,Password), true);
	}
	
	
	public boolean doLogin(String FirstName , String LastName, String Mail,String Telephone,String Password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(LastName);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(Mail);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(Telephone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(Password);
		
		
		driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")).click();
		
		return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();
		
		
//		String errMesg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errMesg);
//		
//		
//		
//		if(errMesg.contains("No match for E-Mail Address and/or Password")) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
	
	
	

}