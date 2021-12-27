package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Product2 {
	
	@JsonProperty("Brand")
	private String brand;
	@JsonProperty("Model")
	private String model;
	@JsonProperty("Version")
	private String version;
}