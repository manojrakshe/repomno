package Demo.TestNGProj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo {

	@AfterClass
	public void closer() {

		System.out.println("Close the Browser");
	}

	@BeforeClass
	public void setup() {

		System.out.println("Launching the Chrome Browser");
	}

	@Test(priority = 1)
	public void testregistration() {

		System.out.println("1. Registration test got execution");

	}

	@Test(priority = 2)
	public void testLogin() {

		System.out.println("2. Logine test got execution");

	}

	@Test(priority = 3)
	public void testHomePage() {

		System.out.println("3. HomePage test got execution");

	}

}
