package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	//Add testNG library
	//Import @Test from org.testing.annotation

	@Test
	public void demo() {
		//Import Reporter from org.testing
		Reporter.log("Hello World",true);
	}
}
