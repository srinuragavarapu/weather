package com.virtusa;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ForecastHelper {

	public ForecastModel getPointsData(String resourceURL) throws IOException{
		RestClient rc = new RestClient();
		String forecastResponse = rc.readResponse(resourceURL);
		ForecastModel forecast = new ObjectMapper().readerFor(ForecastModel.class).readValue(forecastResponse);
		return forecast;
	}
}
