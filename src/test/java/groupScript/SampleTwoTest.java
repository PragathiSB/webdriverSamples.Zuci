package groupScript;

import org.testng.annotations.Test;

public class SampleTwoTest {
  @Test(groups="feature1")
  public void testone() {
	  System.out.println("test1 in sampletwo");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("test2 in sampletwo");
  }
  @Test(groups="feature3")
  public void testthree() {
	  System.out.println("test3 in sampletwo");
  }
}
