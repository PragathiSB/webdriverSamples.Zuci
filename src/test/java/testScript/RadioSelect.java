package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

public class RadioSelect {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");//LAUNCH THE PAGE
	  Select sigSel=new Select(driver.findElement(By.id("select-demo")));
	  sigSel.selectByValue("Tuesday");
	  
	  Select mulSel=new Select(driver.findElement(By.id("multi-select")));
	  if(mulSel.isMultiple())
	  {
		  mulSel.selectByIndex(0);
		  mulSel.selectByValue("Florida");
		  mulSel.selectByVisibleText("Washington");
	  }
	  java.util.List<WebElement> items=mulSel.getAllSelectedOptions();
	  for(WebElement list:items)
	  {
		  System.out.println(list.getText());
	  }
	  System.out.println("items selected:"+items.size());
	  mulSel.deselectByValue("Florida");
  }
}
