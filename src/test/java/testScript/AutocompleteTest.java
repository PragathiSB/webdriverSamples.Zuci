package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutocompleteTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/autocomplete/");//LAUNCH THE PAGE
	  WebElement frame1=driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frame1);
	  WebElement inp=driver.findElement(By.cssSelector("#tags"));
	  inp.sendKeys("action");
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	  WebElement frnull)<WebElement> inpli=ame = driver.findElement(By.xpath("//iframe"));
//	  driver.switchTo().frame("frame");
	  List <WebElement> inplist=driver.findElements(By.xpath("//li//div[@id='ui-id-3']"));
	  for(WebElement li:inplist)
	  {
			  
			  System.out.println(li.getText());
			
		 
	  }
	  
  }
}
