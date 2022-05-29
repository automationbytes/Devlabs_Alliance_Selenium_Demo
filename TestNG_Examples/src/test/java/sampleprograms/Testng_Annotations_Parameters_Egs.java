package sampleprograms;

import org.testng.annotations.Test;

public class Testng_Annotations_Parameters_Egs {

	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(timeOut = 1000)
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 2");
		
	}
	
	@Test(dependsOnMethods = {"test2"},alwaysRun = true)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(description = "test4 method",groups= {"Sanity","Smoke"})
	public void test4() {
		System.out.println("Test 4");
	}
}
