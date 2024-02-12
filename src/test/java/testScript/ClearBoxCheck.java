package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearBoxCheck {
  @Test
  public void clearBox() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationbookstore.dev/");//LAUNCH THE PAGE
	  WebElement srcBox=driver.findElement(By.id("searchBar"));
	  srcBox.sendKeys("java");
	  Thread.sleep(1000);
	  WebElement clearbox=driver.findElement(By.xpath(" //div//a[contains(text(),'Clear text')]"));
	
	  if(clearbox.isDisplayed())
	  {
		clearbox.click();
		System.out.println("text cleared");
	  }
	  else
	  {
		  System.out.println("text clear icon is hidden");
	  }
  }
}
