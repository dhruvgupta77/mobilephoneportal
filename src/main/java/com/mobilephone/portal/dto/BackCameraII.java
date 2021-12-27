package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BackCameraII {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Equivalent Focal Length")
	private String equivalentFocalLength;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Aperture (W)")
	private String apertureW;
	@JsonProperty("Sensor Format")
	private String sensorFormat;
	@JsonProperty("Features")
	private String features;
	@JsonProperty("Focus")
	private String focus;

}
