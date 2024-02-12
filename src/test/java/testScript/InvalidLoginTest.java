package testScript;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvalidLoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void loginsetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
  @Test
  public void incorrectPswd() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
	  usrname.sendKeys("pragathi");
	  WebElement pswd=driver.findElement(By.xpath("//input[@id='loginpassword']"));
	  pswd.sendKeys("pragathi8");
	  WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  loginBtn.click();
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "Wrong password.");
	  alert.accept();
	  
  }
  @Test
  public void incorrectUsrName() throws InterruptedException
  {
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
	  usrname.sendKeys("pragathi8");
	  WebElement pswd=driver.findElement(By.xpath("//input[@id='loginpassword']"));
	  pswd.sendKeys("pragathi");
	  WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  loginBtn.click();    
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "User does not exist.");
	  alert.accept();	  
  }
  @Test
  public void blankPswd() throws InterruptedException
  {
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
	  usrname.sendKeys("pragathi");
	  WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  loginBtn.click();  
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
	  alert.accept();	  
  }
  @Test
  public void blankUsrName() throws InterruptedException
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement pswd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginpassword']")));
	  pswd.sendKeys("pragathi");
	  WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  loginBtn.click();     
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
	  alert.accept();	  
  }
  @Test
  public void blankUsrNameAndPwsd() throws InterruptedException
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']")));
	  loginBtn.click();     
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
	  alert.accept();  
  }
  @AfterMethod
  public void terminate()
  {
	  driver.close();
  } 
}
