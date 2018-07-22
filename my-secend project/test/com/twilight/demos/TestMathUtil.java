package com.twilight.demos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMathUtil {

	private MathUtil math = new MathUtil();
	
	@Test
	public void testAdd() {
		
		int c = math.add(3, 5);
		
		assertEquals(8, c);
	}

	@Test
	public void testMax() {
		int[] d = {11,34,56,67,32,12,65,77};
		
		assertEquals(77, math.max(d));
	}
}
