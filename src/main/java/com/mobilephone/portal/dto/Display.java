package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Display {

	@JsonProperty("Puch holes(s)")
	private String puchHolesS;
	@JsonProperty("Notch(es)")
	private String notchEs;
	@JsonProperty("Diagonal")
	private String diagonal;
	@JsonProperty("Height")
	private String height;
	@JsonProperty("Width")
	private String width;
	@JsonProperty("Bezel Width")
	private String bezelWidth;
	@JsonProperty("Screen to Body Ratio")
	private String screenToBodyRatio;
	@JsonProperty("Refresh Rate")
	private String refreshRate;
	@JsonProperty("Resolution (H x W)")
	private String resolutionHXW;
	@JsonProperty("Pixel Size")
	private String pixelSize;
	@JsonProperty("Dynamic Range")
	private String dynamicRange;
	@JsonProperty("Color Depth")
	private String colorDepth;
	@JsonProperty("Pixel Density")
	private String pixelDensity;
	@JsonProperty("Number of Colors")
	private String numberOfColors;
	@JsonProperty("Glass")
	private String glass;
	@JsonProperty("Illumination")
	private String illumination;
	@JsonProperty("LCD Mode")
	private String lCDMode;
	@JsonProperty("Module")
	private String module;
	@JsonProperty("Subpixels")
	private String subpixels;
	@JsonProperty("Touch Points")
	private String touchPoints;
	@JsonProperty("Touch Point(s)")
	private String touchPointS;
	@JsonProperty("Touch screen Type")
	private String touchScreenType;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("Screen")
	private Screen screen;

}
