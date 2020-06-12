package com.srini;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Application starter
 */
public class App {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please provide latitude and longitude. Example : 39.7456,-97.0892");
			return;
		}
		try {
			PointsHelper pointsHelper = new PointsHelper();
			PointsModel pointsModel = pointsHelper.getPointsData("https://api.weather.gov/points/"+args[0]);
			ForecastHelper forecastHelper = new ForecastHelper();
			ForecastModel fm = forecastHelper.getPointsData("https://api.weather.gov/gridpoints/TOP/"+pointsModel.getGridX()+","+pointsModel.getGridY()+"/forecast");
			Show.inTable(fm);	
		} catch(FileNotFoundException foe) {
			System.out.println("Please check URL : "+ foe.getMessage());
			foe.printStackTrace();
		}catch(IOException ioe) {
			System.out.println("Got Exception : "+ ioe.getMessage());
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
