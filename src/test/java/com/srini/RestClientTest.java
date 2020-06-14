package com.srini;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import com.srini.RestClient;

public class RestClientTest {
	private RestClient rc;
	
	@Before
	public void init() {
		rc = new RestClient();
	}

	@Test(expected = MalformedURLException.class)
	public void testMalformedException() throws IOException {
		rc.readResponse("fttps://api.weather.gov/points/39.7456,-97.0892") ;
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testFileNotFoundException() throws IOException {
		rc.readResponse("https://api.weather.gov/points/39.7456") ;
	}
	
	@Test
	public void testLanAndLatSuccess() throws IOException {
		String response = rc.readResponse("https://api.weather.gov/points/39.7456,-97.0892") ;
		assertTrue(response.contains("@context"));
	}
	
	@Test
	public void testLanAndLatFail() throws IOException {
		String response = rc.readResponse("https://api.weather.gov/points/39.7456,-97.0892") ;
		assertFalse(response.contains("@context-"));
	}
}
