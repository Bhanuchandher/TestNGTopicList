package com.TestNGTopicsList;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void iphone() {
		System.out.println("Priority 1 is: iphone mobile");
	}
	
	@Test(priority = 2)
	public void oneplus() {
		System.out.println("Priority 2 is: one plus mobile");
	}

	@Test(priority = 3)
	public void realeme() {
		System.out.println("Priority 3 is: realme mobile");
	}
	
	@Test(priority = 4)
	public void lenovo() {
		System.out.println("Priority 4 is: lenovo mobile");
	}

}

