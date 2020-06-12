package com.virtusa;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PointsHelper {

	public PointsModel getPointsData(String resourceURL) throws IOException{
		RestClient rc = new RestClient();
		String pointsResponse = rc.readResponse(resourceURL);
		PointsModel points = new ObjectMapper().readerFor(PointsModel.class).readValue(pointsResponse);
		return points;
	}
}
