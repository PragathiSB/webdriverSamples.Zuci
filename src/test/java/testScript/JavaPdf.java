package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaPdf {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("https://www.google.com/");//LAUNCH THE PAGE
	  WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
	  srcBox.sendKeys("Java tutorial");//ENTER VALUES
	  Thread.sleep(1000);
	  List<WebElement> items=driver.findElements(By.xpath("(//ul[@class='G43f7e']//li//descendant::div[@class='wM6W7d'])"));
	  System.out.println("no.of items:"+items.size());
	  for(WebElement elem:items)
	  {
		  if(elem.getText().equalsIgnoreCase("Java tutorial pdf"))
		  {
			  elem.click();
			  break;
		  }
	  }
  }
}
