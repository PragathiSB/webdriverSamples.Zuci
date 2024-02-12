package groupScript;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test
  public void testone() {
	  System.out.println("test1 in samplethree");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("test2 in samplethree");
  }
  @Test
  public void testthree() {
	  System.out.println("test3 in samplethree");
  }
}
