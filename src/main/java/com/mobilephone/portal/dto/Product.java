package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Product {
	
	private String _id;    
	@JsonProperty("Camera")
	private Camera camera;
	@JsonProperty("Design")
	private Design design;
	@JsonProperty("Display")
	private Display display;
	@JsonProperty("Inside")
	private Inside inside;
	@JsonProperty("Product")
	private Product2 product;
	@JsonProperty("Time")
	private Time time;
	@JsonProperty("Image")
	private Image image;
	@JsonProperty("Yes")
	private Yes yes;
	@JsonProperty("Category")
	private String category;


}
