package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SAR {

	@JsonProperty("Body (EU)")
	public String bodyEU;
	@JsonProperty("Head (EU)")
	public String headEU;
	@JsonProperty("Hotspot (USA)")
	public String hotspotUSA;
	@JsonProperty("Body (USA)")
	public String bodyUSA;
	@JsonProperty("Head (USA)")
	public String headUSA;

}
