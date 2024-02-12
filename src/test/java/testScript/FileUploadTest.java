package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");//LAUNCH THE PAGE
	  WebElement addFile=driver.findElement(By.xpath("//input[@type='file']"));
	  String strPath=System.getProperty("user.dir")+"//1706687045716.png";
	  addFile.sendKeys(strPath);
	  driver.findElement(By.xpath("//span[text()='Start upload']")).click();
  }
}
