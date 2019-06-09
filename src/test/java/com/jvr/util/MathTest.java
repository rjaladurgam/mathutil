package com.jvr.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MathTest {
	
	@Test
	public void testAdd() {
		assertEquals(Math.add(2, 2), 4);
		assertNotEquals(Math.add(2, 2), 5);
	}
	
	@Test
	public void testSub() {
		assertEquals(Math.sub(2, 2), 0);
		assertNotEquals(Math.sub(2, 2), 5);
	}
	

}
