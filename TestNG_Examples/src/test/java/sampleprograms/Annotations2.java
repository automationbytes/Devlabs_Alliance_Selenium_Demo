package sampleprograms;

import org.testng.annotations.*;

public class Annotations2 {

	@BeforeClass
	public void beforeclass() {
		System.out.println("@Before Class");
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("@After Class");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@After Test");
		
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@Before Suite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@After Suite");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("@Before Method");
		
	}
	
	@AfterMethod
	public void afterMethd() {
		System.out.println("@After Method");
		
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
