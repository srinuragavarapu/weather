package com.srini;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ForecastHelper {

	private RestClient rc;

	private String getResponse(String resourceURL) throws IOException {
		rc = new RestClient();
		return rc.readResponse(resourceURL);
	}

	private ForecastModel getForecastData(String resourceURL) throws IOException {
		return new ObjectMapper().readerFor(ForecastModel.class).readValue(getResponse(resourceURL));
	}

	private PointsModel getPointsData(String resourceURL) throws IOException {
		return new ObjectMapper().readerFor(PointsModel.class).readValue(getResponse(resourceURL));
	}

	public ForecastModel getForeCast(String lanAndLat) {
		ForecastModel forecastModel = null;
		try {
			PointsModel pointesModel = getPointsData("https://api.weather.gov/points/" + lanAndLat);
			forecastModel = getForecastData("https://api.weather.gov/gridpoints/" + pointesModel.getCwa() + "/"
					+ pointesModel.getGridX() + "," + pointesModel.getGridY() + "/forecast");
		} catch (FileNotFoundException foe) {
			// foe.printStackTrace();
			System.out.println(
					"You entered wront {latitude},{longitude}. Example : 39.7456,-97.0892 " + foe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Please verify URL : " + ioe.getMessage());
		} catch (Exception e) {
			System.out.println("Got Unknown Exception" + e.getMessage());
		}
		return forecastModel;

	}

}
