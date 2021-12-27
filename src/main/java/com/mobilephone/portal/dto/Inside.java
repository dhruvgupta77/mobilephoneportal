package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Inside {

	@JsonProperty("Battery")
	private Battery battery;
	@JsonProperty("Cellular")
	private Cellular cellular;
	@JsonProperty("Location")
	private Location location;
	@JsonProperty("Processor")
	private Processor processor;
	@JsonProperty("RAM")
	private RAM rAM;
	@JsonProperty("SAR")
	private SAR sAR;
	@JsonProperty("Sensor(s)")
	private SensorS sensorS;
	@JsonProperty("Software")
	private Software software;
	@JsonProperty("Storage")
	private Storage storage;
	@JsonProperty("Wireless")
	private Wireless wireless;

}
