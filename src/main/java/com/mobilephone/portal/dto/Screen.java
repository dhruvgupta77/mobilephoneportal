package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Screen {

	@JsonProperty("Module")
	public String module;
	@JsonProperty("Type")
	public String type;
	@JsonProperty("Diagonal")
	public String diagonal;
	@JsonProperty("Height")
	public String height;
	@JsonProperty("Width")
	public String width;
	@JsonProperty("Number of Colors")
	public String numberOfColors;
	@JsonProperty("Resolution (H x W)")
	public String resolutionHXW;
	@JsonProperty("Pixel Density")
	public String pixelDensity;
	@JsonProperty("Color Depth")
	public String colorDepth;
	@JsonProperty("Dynamic Range")
	public String dynamicRange;
	@JsonProperty("Pixel Size")
	public String pixelSize;
	@JsonProperty("Glass")
	public String glass;
	@JsonProperty("Illumination")
	public String illumination;
	@JsonProperty("LCD Mode")
	public String lCDMode;
	@JsonProperty("Subpixels")
	public String subpixels;

}
