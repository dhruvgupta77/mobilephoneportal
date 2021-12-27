package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SensorS {

	@JsonProperty("Present")
	public String present;
	@JsonProperty("Sensor(s)")
	public String sensorS;
	@JsonProperty("Accelerometer")
	public String accelerometer;
	@JsonProperty("Compass")
	public String compass;
	@JsonProperty("Gyroscope")
	public String gyroscope;
	@JsonProperty("Barcode Scanners")
	public String barcodeScanners;

}
