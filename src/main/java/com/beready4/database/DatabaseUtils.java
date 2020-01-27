package com.beready4.database;

import java.util.ArrayList;
import java.util.List;

import com.beready4.numeric.NumericUtils;

public class DatabaseUtils {

	// in clause parameter padding
	public static List paddingInClauseParameter(List<String> parameters) {
		if (parameters == null) {
			return null;
		}

		// TODO algorithm optimize
		int paramLen = parameters.size();
		int adjustedLen = NumericUtils.nextPowOfTwo(paramLen);
		List<String> padded = new ArrayList<>(adjustedLen);

		padded.addAll(parameters);

		String lastValue = parameters.get(paramLen - 1);

		for (int i = paramLen; i < adjustedLen; i++) {
			padded.add(lastValue);
		}

		return padded;
	}
}