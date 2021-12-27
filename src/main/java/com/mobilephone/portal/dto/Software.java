package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Software {

	@JsonProperty("OS")
	public String oS;
	@JsonProperty("OS Version")
	public String oSVersion;
	@JsonProperty("Kernel Version")
	public String kernelVersion;

}
