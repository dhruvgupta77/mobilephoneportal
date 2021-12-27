package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FrontCamera {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Minimum Focal Length")
	private String minimumFocalLength;
	@JsonProperty("Resolution (H x W)")
	private String resolutionHXW;
	@JsonProperty("Video Resolution")
	private String videoResolution;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Aperture (W)")
	private String apertureW;
	@JsonProperty("Sensor Format")
	private String sensorFormat;
	@JsonProperty("Image Format")
	private String imageFormat;
	@JsonProperty("Video Format")
	private String videoFormat;
	@JsonProperty("Flash")
	private String flash;
	@JsonProperty("Focus")
	private String focus;
	@JsonProperty("Features")
	private String features;

}
