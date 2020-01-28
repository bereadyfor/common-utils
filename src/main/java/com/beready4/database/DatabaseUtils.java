package com.beready4.database;

import java.util.Arrays;
import java.util.List;

import com.beready4.numeric.NumericUtils;

public class DatabaseUtils {

	// in clause parameter padding
	public static List<String> paddingInClauseParameter(List<String> parameters) {
		if (parameters == null) {
			return null;
		}

		// TODO algorithm optimize
		int paramLen = parameters.size();
		String[] padded = new String[NumericUtils.nextPowOfTwo(paramLen)];

		Arrays.fill(parameters.toArray(padded), paramLen, padded.length, parameters.get(paramLen - 1));

		return Arrays.asList(padded);
	}
}