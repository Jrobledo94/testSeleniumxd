package com.tgc.testautomation.testSelenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class prueba {
	@Test
	public void  testprueba() {
		System.out.println("2");
		
		App test = new App();
		test.iniciarWikipedia();
		
		int res = 1+1;
		assertEquals(res, 2);
	}

}
