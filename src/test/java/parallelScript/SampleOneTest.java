package parallelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleOneTest {
	WebDriver driver;
	@Test
	  public void testone() {
		driver=new ChromeDriver();
		long id=Thread.currentThread().getId();
		  System.out.println("test1 in sample 1"+id);
	  }
	  @Test(invocationCount=7,threadPoolSize=)
	  public void testtwo() {
		  driver=new ChromeDriver();
			long id=Thread.currentThread().getId();
		  System.out.println("test2 in sample 1"+id);
	  }
	  @Test
	  public void testthree() {
		  driver=new ChromeDriver();
			long id=Thread.currentThread().getId();
		  System.out.println("test3 in sample 1"+id);
	  }
}
