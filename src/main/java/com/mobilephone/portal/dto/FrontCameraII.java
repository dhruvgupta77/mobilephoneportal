package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FrontCameraII {
	

	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Aperture (W)")
	private String apertureW;


}
