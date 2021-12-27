package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductSpecificationResponseDto {
	@JsonProperty("Success")
	private int success;
	private String message;
	private Error error;
	private ProductData data;
}