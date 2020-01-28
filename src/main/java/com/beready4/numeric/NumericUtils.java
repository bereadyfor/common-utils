package com.beready4.numeric;

import java.util.Optional;

public class NumericUtils {

	public static int nextPowOfTwo(Integer value) {
		return Optional.ofNullable(value)
			.filter(v -> v > 0)
			.map(v -> Integer.highestOneBit(v))
			.map(v -> value.equals(v) ? value : v << 1)
			.orElse(1);
	}
}
