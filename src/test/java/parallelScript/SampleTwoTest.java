package parallelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTwoTest {
	WebDriver driver;
	@Test
	  public void testone() {
		driver=new ChromeDriver();
		long id=Thread.currentThread().getId();
		  System.out.println("test1 in sample 2"+id);
	  }
	  @Test(groups="feature2")
	  public void testtwo() {
		  driver=new ChromeDriver();
			long id=Thread.currentThread().getId();
		  System.out.println("test2 in sample 2"+id);
	  }
	  @Test
	  public void testthree() {
		  driver=new ChromeDriver();
			long id=Thread.currentThread().getId();
		  System.out.println("test3 in sample 2"+id);
	  }
}
