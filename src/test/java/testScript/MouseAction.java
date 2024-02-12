package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  //driver.get("https://automationbookstore.dev/");//LAUNCH THE PAGE
	  driver.get("https://stqatools.com/demo/MouseHover.php");
	  WebElement menu=driver.findElement(By.cssSelector("button.dropbtn"));
	  actions.moveToElement(menu).perform();
	  WebElement menuItem=driver.findElement(By.cssSelector("div.dropdown-content > a:nth-child(1)"));
	  actions.moveToElement(menu).click(menuItem).build().perform();
  }
}
