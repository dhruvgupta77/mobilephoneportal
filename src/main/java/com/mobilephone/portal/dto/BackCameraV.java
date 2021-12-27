package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BackCameraV {
	

	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Aperture (W)")
	private String apertureW;
	@JsonProperty("Focus")
	private String focus;
	@JsonProperty("Features")
	private String features;


}
