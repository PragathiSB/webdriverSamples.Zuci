package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");//LAUNCH THE PAGE
	  driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[1]")).click();
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "I am an alert box!");
	  alert.accept();
	  
	  driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[2]")).click();
	  Alert confirm=driver.switchTo().alert();
	  System.out.println("alert text:"+confirm.getText());
	  confirm.dismiss();
	  
	  driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
	  Alert prompt=driver.switchTo().alert();
	  System.out.println("alert text:"+prompt.getText());
	  prompt.sendKeys("Hello Welcome");
	 // prompt.accept();
	 prompt.dismiss();
	  
	  
  }
}
