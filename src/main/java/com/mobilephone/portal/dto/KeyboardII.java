package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class KeyboardII {

	@JsonProperty("Design")
	private String design;
	@JsonProperty("Backlight")
	private String backlight;
	@JsonProperty("Keys")
	private String keys;

}
