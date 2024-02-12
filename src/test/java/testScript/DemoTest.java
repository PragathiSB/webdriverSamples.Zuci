package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");//LAUNCH THE PAGE
//	  WebElement fName=driver.findElement(By.id("firstName"));
//	  fName.sendKeys("jenny");
//	  WebElement lName=driver.findElement(By.id("lastName"));
//	  lName.sendKeys("abraham");
//	  WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
//	  email.sendKeys("jenny@gmail.com");
//	  WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
//	  gender.click();
//	  WebElement number=driver.findElement(By.xpath("//input[@id='userNumber']"));
//	  number.sendKeys("903476834");
//	  driver.findElement(By.xpath("div[class$='006']")).click();
//	  Select sigSel=new Select(driver.findElement(By.xpath("//div/select[@class='react-datepicker__month-select']")));
//	  sigSel.selectByVisibleText("April");
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  WebElement date=(WebElement)js.executeScript("return document.getElementById('dateOfBirthInput').value='05 Mar 2024'");

//
//	   
//	  WebElement addFile=driver.findElement(By.xpath("//input[@type='file']"));
//	  String strPath=System.getProperty("user.dir")+"//1706687045716.png";
//	  addFile.sendKeys(strPath);
//	  WebElement addr=driver.findElement(By.id("currentAddress"));
//     addr.sendKeys("chennai");
	  WebElement state = driver.findElement(By.id("react-select-3-input"));
	  state.sendKeys("rajas");
	  driver.findElement(By.id("react-select-3-option-3")).click();
	  
	  
//	  WebElement sub = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
//	  sub.sendKeys("Ag");
	 // driver.findElement(By.id("react-select-4-option-0")).click();
	  
//	  WebElement inp=driver.findElement(By.xpath("//div[@class=' css-26l3qy-menu']//div[contains(text(),'Agra')]"));
//	  System.out.println(inp.getText());
//     WebElement hobby=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
//     hobby.click();
//     
//	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	  String url = js.executeScript("return document.getElementById('react-select-4-option-1');").toString();
//	  System.out.println(url);
  }
}
