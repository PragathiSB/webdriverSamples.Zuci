package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductStoreTest {
	WebDriver driver;
	Properties tempProp;
	@BeforeClass
	public void setup() throws IOException
	{
		  tempProp = new Properties();
			String path=System.getProperty("user.dir")+"//src//test//resources//config//login.properties";
			FileInputStream fin = new FileInputStream(path);
			tempProp.load(fin);
		  driver=new ChromeDriver();
		  driver.get("https://www.demoblaze.com/");	
	}
  @Test(priority=1)
  public void login() throws IOException, Exception {
	   
	  WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
	  login.click();
	  String uname = tempProp.getProperty("username");
	  System.out.println(uname);
      String password = tempProp.getProperty("password");
      Thread.sleep(1000);
	  WebElement usrname=driver.findElement(By.xpath("//input[@id='loginusername']"));
	  usrname.sendKeys(uname);
	  WebElement pswd=driver.findElement(By.xpath("//input[@id='loginpassword']"));
	  pswd.sendKeys(password);
	  WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  loginBtn.click();	
	  
  }
  @Test(priority=2)
  public void addItem() throws InterruptedException
  {
	  String itemname=tempProp.getProperty("item");
	  System.out.println(itemname);
	  driver.navigate().refresh();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement itemLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + itemname + "')]")));
      itemLink.click();
//	  WebElement it=driver.findElement(By.xpath("//a[text()='"+itemname+"']"));
//	  it.click();
	  Thread.sleep(2000);
	  WebElement cart=driver.findElement(By.xpath("//a[text()='Add to cart']"));
	  cart.click();
	  Thread.sleep(1000);
	 // Actions actions=new Actions(driver);
	  Alert alert=driver.switchTo().alert();
	  Assert.assertEquals(alert.getText(), "Product added");
	  alert.accept();
  
  }
}
