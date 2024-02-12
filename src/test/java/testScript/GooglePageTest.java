package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");//LAUNCH THE PAGE
		WebElement srcBox=driver.findElement(By.id("APjFqb"));//LOCATE THE ELEMENT
		srcBox.sendKeys("Java tutorial");//ENTER VALUES
		srcBox.sendKeys(Keys.ENTER);

	}

}
