package com.beready4.numeric;

public class NumericUtils {

	public static int nextPowOfTwo(int value) {
		int highestOneBit = Integer.highestOneBit(value);
		return value == highestOneBit ? value : highestOneBit << 1;
	}
}
