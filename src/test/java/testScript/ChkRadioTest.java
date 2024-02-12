package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChkRadioTest {
  @Test
  public void chkRadio() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");//LAUNCH THE PAGE
	  WebElement age=driver.findElement(By.id("isAgeSelected"));
	  if(!age.isSelected())
	  {
		  age.click();
	  }
	  driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
	  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	  driver.findElement(By.xpath("//input[@value='5 - 15']"));
	  
  }
}
