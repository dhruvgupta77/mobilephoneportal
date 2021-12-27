package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BackCamera {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Sensor")
	private String sensor;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Resolution (H x W)")
	private String resolutionHXW;
	@JsonProperty("Video Resolution")
	private String videoResolution;
	@JsonProperty("Equivalent Focal Length")
	private String equivalentFocalLength;
	@JsonProperty("Minimum Focal Length")
	private String minimumFocalLength;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Aperture (T)")
	private String apertureT;
	@JsonProperty("Aperture (W)")
	private String apertureW;
	@JsonProperty("Zoom")
	private String zoom;
	@JsonProperty("Sensor Format")
	private String sensorFormat;
	@JsonProperty("Features")
	private String features;
	@JsonProperty("Flash")
	private String flash;
	@JsonProperty("Focus")
	private String focus;
	@JsonProperty("Image Format")
	private String imageFormat;
	@JsonProperty("Video Format")
	private String videoFormat;

}
