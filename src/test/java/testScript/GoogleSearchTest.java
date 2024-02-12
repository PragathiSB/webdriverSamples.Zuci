package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleSearchTest {
  @Test//annotation
  public void searchJavaTest() {
	//	ChromeOptions options=new ChromeOptions();
	//	options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("Java tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Before click back..page title:...."+driver.getTitle());//interrogation method-grettitle
		driver.navigate().back();
		System.out.println("After click back..page title:...."+driver.getTitle());
		driver.navigate().forward();
		System.out.println("URL:...."+driver.getCurrentUrl());
		
		}
}
