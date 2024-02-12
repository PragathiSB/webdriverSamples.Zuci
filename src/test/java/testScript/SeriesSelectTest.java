package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeriesSelectTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  //driver.get("https://automationbookstore.dev/");//LAUNCH THE PAGE
	  driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
	  WebElement enabled=driver.findElement(By.xpath("//a[text()='Enabled']"));
	  actions.moveToElement(enabled).perform();
	  Thread.sleep(1000);
	  WebElement downloads=driver.findElement(By.xpath("//a[text()='Downloads']"));
	  actions.moveToElement(enabled).click(downloads).build().perform();
	  Thread.sleep(1000);
	  WebElement pdf=driver.findElement(By.xpath("//a[text()='PDF']"));
	  actions.moveToElement(downloads).click(pdf).build().perform();
	  
	  
  }
}
