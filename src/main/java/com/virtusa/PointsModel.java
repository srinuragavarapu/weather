package com.virtusa;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PointsModel {

	private String cwa;
	private Integer gridX;
	private Integer gridY;
	
	@JsonProperty("properties")
	private void flatPropertiesNode(Map<String, Object> properties) {
		this.cwa = (String)properties.get("cwa");
		this.gridX = (Integer)properties.get("gridX");
		this.gridY = (Integer)properties.get("gridY");
	}

	public String getCwa() {
		return cwa;
	}

	public void setCwa(String cwa) {
		this.cwa = cwa;
	}

	public Integer getGridX() {
		return gridX;
	}

	public void setGridX(Integer gridX) {
		this.gridX = gridX;
	}

	public Integer getGridY() {
		return gridY;
	}

	public void setGridY(Integer gridY) {
		this.gridY = gridY;
	}
	
}
