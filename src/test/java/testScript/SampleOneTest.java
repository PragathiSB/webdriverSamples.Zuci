package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class SampleOneTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	@BeforeTest
	public void setupExtent()
	{
		extentReports=new ExtentReports();
		spark=new ExtentSparkReporter("test-output/SparkReport.html")
				.viewConfigurer()
				.viewOrder()
				.as(new ViewName[] {
						ViewName.DASHBOARD,
						ViewName.TEST,
						ViewName.AUTHOR,
						ViewName.DEVICE,
						ViewName.LOG
				}).apply();
		extentReports.attachReporter(spark);
		
	}
	
	
	@BeforeMethod
	//@BeforeTest
	public void setup(){
		driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	}
	
  @Test(retryAnalyzer=RetryAnalyser.class)
  //(alwaysRun=true,dependsOnMethods="googleSearchappium")//(priority=2)//the priority is given to assign priority to execution of methods/set order of method
  public void googleSearch() {
	
		
		//WebDriver driver=new EdgeDriver();
	    extentTest=extentReports.createTest("Java Search Test");
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		SoftAssert softAssert=new SoftAssert();
		//softAssert.assertEquals(driver.getTitle(), "Google");
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("Java tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		softAssert.assertEquals(driver.getTitle(), "Java tutorial - Google Search");
		softAssert.assertAll();//
}
  @Test//(enabled=false)
  
public void googleSearchappium() {
		
		//options.setBrowserVersion("115");
	
		//WebDriver driver=new EdgeDriver();
	  extentTest=extentReports.createTest("Appium Search Test");
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("appium tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "appium tutorial - Google Searchp");
}
@AfterMethod
 // @AfterTest
public void ending(ITestResult result)
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		extentTest.assignAuthor("AutomationTester1").assignCategory("Regression").assignDevice(System.getProperty("os.name")).assignDevice(System.getProperty("os.version"));
		extentTest.log(Status.FAIL,result.getThrowable().getMessage());
	    String strPath=Utility.getScreenshotPath(driver);
	    extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
	}
	else if(ITestResult.SKIP==result.getStatus())
	{
		extentTest.log(Status.SKIP,result.getThrowable().getMessage());
	}
	//driver.close();
}
@AfterTest
public void finishExtent()
{
	extentReports.flush();
}
}
