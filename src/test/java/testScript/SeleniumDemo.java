package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
  @Test
  public void inputForm() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");//LAUNCH THE PAGE
	  WebElement msgbox=driver.findElement(By.id("user-message"));
	  msgbox.sendKeys("welcome");
	  WebElement showmsg=driver.findElement(By.xpath("//button[text()='Show Message']"));
	  showmsg.click();
	 
	  WebElement valueA=driver.findElement(By.id("value1"));
	  valueA.sendKeys("3");
	  WebElement valueB=driver.findElement(By.id("value2"));
	  valueB.sendKeys("4");
	  WebElement total=driver.findElement(By.xpath("//button[text()='Get Total']"));
	  total.click();
  }
}
