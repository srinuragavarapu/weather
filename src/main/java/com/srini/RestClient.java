package com.srini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 * To Make http calls
 */
public class RestClient {
	
	public String readResponse(String resourceURL) throws IOException {
		StringBuilder sb = new StringBuilder();
		URL url = new URL(resourceURL);
		URLConnection urlConnection = url.openConnection();
		InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		br.lines().forEach(line -> sb.append(line));
		return sb.toString();
	}	
}
