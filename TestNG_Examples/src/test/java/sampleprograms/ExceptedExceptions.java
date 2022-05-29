package sampleprograms;

import java.io.*;

import org.testng.annotations.Test;

public class ExceptedExceptions {
	@Test(expectedExceptions = IOException.class, timeOut=4000)
	public void test1() throws NullPointerException, InterruptedException {
		Thread.sleep(1000);
		throw new NullPointerException();
	}
	
	@Test(invocationCount = 5,groups= {"Regression"})
	public void test2() throws InterruptedException {
		//Thread.sleep(10000);
		System.out.println("Test 2");
	}
	
}
