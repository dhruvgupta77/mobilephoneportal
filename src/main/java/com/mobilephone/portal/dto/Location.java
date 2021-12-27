package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Parallel GPS Channels")
	private String parallelGPSChannels;
	@JsonProperty("Navigation")
	private String navigation;
	@JsonProperty("GPS")
	private String gPS;
	@JsonProperty("Galileo")
	private String galileo;
	@JsonProperty("BeiDou")
	private String beiDou;
	@JsonProperty("GLONASS")
	private String gLONASS;
	@JsonProperty("GPS Feature(s)")
	private String gPSFeatureS;

}
