package com.srini;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ForecastHelperTest {

	private ForecastHelper fh;
	
	@Before
	public void init() {
		fh = new ForecastHelper();
	}
	
	@Test
	public void testSuccess() {
		//Provide proper Longitude and Latitude
		assertTrue(!fh.getForeCast("39.7456,-97.0892").getPeriods().isEmpty());
	}
	
	@Test(expected = NullPointerException.class)
	public void testFailure() {
		//Provide wrong Latitude or Longitude
		assertTrue(!fh.getForeCast("39.7456").getPeriods().isEmpty());
	}
	
	@Test(expected = NullPointerException.class)
	public void testFailureByUnknownSring() {
		//Provide wrong Latitude or Longitude
		assertTrue(!fh.getForeCast("SRINI").getPeriods().isEmpty());
	}
}
