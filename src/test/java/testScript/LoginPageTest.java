package testScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
  @Test
  public void validLogin() throws FileNotFoundException {
	  Properties tempProp = new Properties();
		FileInputStream obtained = new FileInputStream("config.properties");
		tempProp.load(obtained);
		 String url=tempProp.getProperty("url");
		 String browser=tempProp.getProperty("browser");


		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get(url);//LAUNCH THE PAGE
		WebElement username=driver.findElement(By.id("username"));//LOCATE THE ELEMENT
		username.sendKeys("tomsmith");//ENTER VALUES
		WebElement password=driver.findElement(By.id("password"));//LOCATE THE ELEMENT
		password.sendKeys("SuperSecretPassword!");//ENTER VALUES
		//WebElement login=driver.findElement(By.className("radius"));//LOCATE THE ELEMENT
		//login.click();
		//driver.findElement(By.cssSelector(".radius")).click();
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.linkText("Elemental Selenium")).click();//only for achor elements
		//driver.findElement(By.partialLinkText("Elemental")).click();	//only for achor elements
		boolean isValid=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValid);
		
  }
}
