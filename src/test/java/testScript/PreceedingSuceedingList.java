package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PreceedingSuceedingList {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.lambdatest.com/blog/");//LAUNCH THE PAGE
	  List<WebElement> preitems=driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[.//a[text()='Playwright Testing']]/preceding-sibling::li"));
	  System.out.println("list preceeding to Playwright testing.......");
	  for(WebElement list:preitems)
	  {
		  System.out.println(list.getText());
	  }
	  List<WebElement> sucitems=driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li//a[text()='Playwright Testing']//following::li[starts-with(@id,'menu-item-')]"));
	  System.out.println("list succeeding to Playwright testing........");
	  for(WebElement list:sucitems)
	  {
		  System.out.println(list.getText());
	  }
	  System.out.println(sucitems.size());
  }
}
