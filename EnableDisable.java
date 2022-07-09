package com.TestNGTopicsList;

import org.testng.annotations.Test;

public class EnableDisable {

	@Test(enabled = true)
	public void royalenfield() {
		System.out.println("royalenfield bikes");
	}

	@Test(enabled = true)
	public void yamaha() {
		System.out.println("yamaha bikes");
	}

	@Test(enabled = false)
	public void bajaj() {
		System.out.println("bajaj bikes");
	}

	@Test(enabled = false)
	public void honda() {
		System.out.println("Honda bikes");
	}



}
