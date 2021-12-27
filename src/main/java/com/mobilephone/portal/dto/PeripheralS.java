package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PeripheralS {

	@JsonProperty("Present")
	private String present;
	@JsonProperty("D Pad")
	private String dPad;
	@JsonProperty("Scrolling & Navigation")
	private String scrollingNavigation;

}
