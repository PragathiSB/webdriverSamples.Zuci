package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleMultiClick {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  //driver.get("https://automationbookstore.dev/");//LAUNCH THE PAGE
	  driver.get("https://stqatools.com/demo/DoubleClick.php");
	  Thread.sleep(1000);
	  WebElement btn=driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
	  actions.doubleClick(btn).perform();
	  actions.doubleClick(btn).doubleClick(btn).build().perform();
	  
  }
}
