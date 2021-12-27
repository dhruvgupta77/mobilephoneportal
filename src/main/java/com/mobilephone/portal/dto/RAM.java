package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RAM {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Capacity")
	private String capacity;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("Clock Speed")
	private Object clockSpeed;

}
