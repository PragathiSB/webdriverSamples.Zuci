package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuiteSample {
  @Test
  public void googleSearch() {
		ChromeOptions options=new ChromeOptions();
		//options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("Java tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Java tutorial - Google Search");
  }
  public void googleSearchappium() {
		ChromeOptions options=new ChromeOptions();
		//options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("appium tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "appium tutorial - Google Search");
}
  public void googleSearchCucumber() {
		ChromeOptions options=new ChromeOptions();
		//options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("Cucumber tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Cucumber tutorial - Google Search");
}
}
