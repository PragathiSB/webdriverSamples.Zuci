package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHadleSample {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://stqatools.com/demo/Windows.php");//LAUNCH THE PAGE
	  
	  String parentWin=driver.getWindowHandle();
	  System.out.println("parent window handle:"+parentWin);
	  driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
	  
	  Set<String> tabs=driver.getWindowHandles();//set b/c window handles are un
	  System.out.println("number of window:"+tabs.size());
	  for(String childWin:tabs)
	  {
		  System.out.println(childWin);
		  if(!childWin.equalsIgnoreCase(parentWin))
		  {
			  driver.switchTo().window(childWin);
			  driver.findElement(By.xpath("//a[contains(text(),'Java')]")).click();
		  }
	  }
	  
	  driver.close();
	  driver.switchTo().window(parentWin);
	  driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
	  
	  Set<String> wins=driver.getWindowHandles();
	  System.out.println("number of windows:"+wins.size());
	  for(String childWin:wins)
	  {
		  System.out.println(childWin);
		  if(!childWin.equalsIgnoreCase(parentWin))
		  {
			  driver.switchTo().window(childWin);
		  }
	  }
	  driver.close();
	 // driver.quit();
  }
}
