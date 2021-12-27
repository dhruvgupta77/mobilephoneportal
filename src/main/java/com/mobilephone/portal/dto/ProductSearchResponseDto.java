package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductSearchResponseDto {

	@JsonProperty("Success")
	private int success;
	private String message;
	private Error error;
	private _Data data;
}
