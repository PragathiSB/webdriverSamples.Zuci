package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoqaFormTest {
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
	  WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	  gender.click();
	  WebElement number=driver.findElement(By.xpath("//input[@id='userNumber']"));
	  number.sendKeys("903476834");
//	  WebElement date=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016']"));
//	  date.click();
//	  Select mulSel=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
//	  mulSel.selectByVisibleText("February"); 
	 // WebElement src=driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
	//  src.click();
	  //src.sendKeys("english");
	   
	  WebElement addFile=driver.findElement(By.xpath("//input[@type='file']"));
	  String strPath=System.getProperty("user.dir")+"//1706687045716.png";
	  addFile.sendKeys(strPath);
	  //WebElement sp=driver.findElement(By.xpath("//input[@value='1']"));
	  //sp.click();
	  WebElement addr=driver.findElement(By.id("currentAddress"));
     addr.sendKeys("chennai");
      WebElement hobbie=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
    
   
	 
	  
	 
	  
	  
	  
  }
}
