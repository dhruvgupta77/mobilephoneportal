package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Image {
	

	@JsonProperty("Front")
	private String front;
	@JsonProperty("Back")
	private String back;


}
