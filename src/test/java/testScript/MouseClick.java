package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseClick {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  //driver.get("https://automationbookstore.dev/");//LAUNCH THE PAGE
	  driver.get("https://demo.opencart.com/");
	  //rightclick on component
	 // WebElement srcBox=driver.findElement(By.id("searchBar"));
	 // actions.contextClick(srcBox).perform();
	  WebElement menu=driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));
  }
}
