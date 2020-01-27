package com.beready4.numeric;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumericUtilsTest {

	@Test
	public void nextPowOfTwo() {
		assertTrue(NumericUtils.nextPowOfTwo(0) == 0);
		assertTrue(NumericUtils.nextPowOfTwo(1) == 1);
		assertTrue(NumericUtils.nextPowOfTwo(2) == 2);
		assertTrue(NumericUtils.nextPowOfTwo(7) == 8);
		assertTrue(NumericUtils.nextPowOfTwo(128) == 128);
		assertTrue(NumericUtils.nextPowOfTwo(129) == 256);
	}
}
