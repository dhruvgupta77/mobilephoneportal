package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BackCameraIII {

	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Equivalent Focal Length")
	private String equivalentFocalLength;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Sensor Format")
	private String sensorFormat;
	@JsonProperty("Aperture (W)")
	private String apertureW;
	@JsonProperty("Focus")
	private String focus;
	@JsonProperty("Features")
	private String features;

}
