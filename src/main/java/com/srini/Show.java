package com.srini;

import java.util.LinkedHashMap;
import java.util.Optional;

public class Show {
	
	public static void inTable(ForecastModel fm) {
		Optional<LinkedHashMap<String, Object>> firstRecord = fm.getPeriods().stream().findFirst();
		if(firstRecord.isPresent()) {
			System.out.format("%5s %-20s %-30s %-30s %-10s %-10s %-5s %-10s %-15s %-10s %-50s",
					"number","name","startTime","endTime","isDaytime","temperature","temperatureUnit","temperatureTrend","windSpeed","windDirection","shortForecast");
			System.out.println();
		}
		fm.getPeriods().stream().forEach(x ->{
			System.out.format("%5d %-20s %-30s %-30s %-10s %-10s %-5s %-10s %-15s %-10s %-50s",x.get("number"),x.get("name"),x.get("startTime"),x.get("endTime"),x.get("isDaytime"),x.get("temperature"),x.get("temperatureUnit"),x.get("temperatureTrend"),x.get("windSpeed"),x.get("windDirection"),x.get("shortForecast"));
			System.out.println();
		});
	}
}
