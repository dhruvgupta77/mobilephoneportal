package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Design {

	@JsonProperty("Height")
	private String height;
	@JsonProperty("Width")
	private String width;
	@JsonProperty("Thickness")
	private String thickness;
	@JsonProperty("Weight")
	private String weight;
	@JsonProperty("Color(s)")
	private String colorS;
	@JsonProperty("IP Rating")
	private String iPRating;
	@JsonProperty("Keyboard")
	private Keyboard keyboard;
	@JsonProperty("Keyboard II")
	private KeyboardII keyboardII;

}
