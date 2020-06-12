package com.virtusa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastModel {

	private Map<String, Object> properties;
	//private List<ForecastPeriodModel> forecastPeriodModels;
	private List<LinkedHashMap<String, Object>> periods;

	public Map<String, Object> getProperties() {
		return properties;
	}

	@SuppressWarnings("unchecked")
	public void setProperties(Map<String, Object> properties) {
		this.periods = (List<LinkedHashMap<String, Object>>)properties.get(("periods"));
	}
	
	/*
	 * public List<ForecastPeriodModel> getForecastPeriodModels(){ return
	 * this.forecastPeriodModels; }
	 */
	
	public  List<LinkedHashMap<String, Object>> getPeriods(){
		return this.periods;
	}
}
