package testScript;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideImageTest {
  @Test
  public void f() {
	  ChromeOptions options=new ChromeOptions();
	//  options.addArguments("--blink-settings=imageEnabled=false");
	  //method2
	  Map<String,Object> prefs=new HashMap<String,Object>();
	  prefs.put("profile.managed_default_content_settings.images", 2);
	  options.setExperimentalOption("prefs", prefs);
	  WebElement driver=new ChromeDriver(options);
	 driver.get("https://demo.opencart.com/");
  }
}
