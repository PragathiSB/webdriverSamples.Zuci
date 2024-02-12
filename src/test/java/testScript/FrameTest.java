package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FrameTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");//LAUNCH THE PAGE
	  driver.switchTo().frame("frame1");
	  WebElement inpBox=driver.findElement(By.xpath("//input[@type='text']"));
	  inpBox.sendKeys("hello welcome");
	  
	  driver.switchTo().frame("frame3");
	  WebElement inpBox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
	  inpBox1.click();
	  
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("frame2");
	 // WebElement dropbox=driver.findElement(By.xpath("//select[@id='animals']"));
	  Select sigSel=new Select(driver.findElement(By.id("animals")));
	  sigSel.selectByValue("babycat");
	  java.util.List<WebElement> items=sigSel.getAllSelectedOptions();
	  for(WebElement list:items)
	  {
		  System.out.println(list.getText());
	  }

	  	  
  }
}
