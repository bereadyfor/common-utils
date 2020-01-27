package com.beready4.database;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DatabaseUtilsTest {

	@Test
	public void testPaddingInClauseParameter() {
		List<String> parameters = new ArrayList<>();
		parameters.add("1");
		parameters.add("2");
		parameters.add("3");
		parameters.add("4");
		parameters.add("5");

		List<String> padded = DatabaseUtils.paddingInClauseParameter(parameters);
		assertThat(padded.size(), is(8));
		assertThat(padded.get(4), is("5"));
		assertThat(padded.get(5), is("5"));
		assertThat(padded.get(6), is("5"));
		assertThat(padded.get(7), is("5"));
	}
}
