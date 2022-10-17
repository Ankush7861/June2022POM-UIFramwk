package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowdomelementHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://selectorshub.com/xpath-practice-page/");
driver.switchTo().frame("pact");
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement tea=(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");


tea.sendKeys("masala tea");
//driver.findElement(By.id("tea")).sendKeys("masala tea");




	}
}
