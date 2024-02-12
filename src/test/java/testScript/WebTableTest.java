package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void searchEmpDetails() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	  //List<WebElement> items=driver.findElements(By.xpath("//td[text()='B.Wagner']//following-sibling::td"));
	List<WebElement> items=driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));//serach names of employees in san francisco

	  System.out.println("Number of items....."+items.size());
	  for(WebElement elem:items)
	  {
		  System.out.println(elem.getText());
	  }
	 // String items1=driver.findElement(By.xpath("//td[text()='B. Wagner']//following-sibling::tr[5]")).getText();
	  //System.out.println("salary:"+items1);
	  
	  
  }
}
