package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeExTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  driver.switchTo().frame("mce_0_ifr");
	  Thread.sleep(1000);
	  WebElement pe=driver.findElement(By.xpath("//body[@id='tinymce']//p"));
	  pe.clear();
	  pe.sendKeys("hello...how are you");
	  driver.switchTo().defaultContent();
	  WebElement btn=driver.findElement(By.xpath("//a[text()='Powered by Tiny']"));
	  btn.click();
  }
}
