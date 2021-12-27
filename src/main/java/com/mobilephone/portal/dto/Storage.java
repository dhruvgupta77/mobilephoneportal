package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Storage {

	@JsonProperty("Module")
	public String module;
	@JsonProperty("Type")
	public String type;
	@JsonProperty("Capacity I")
	public String capacityI;
	@JsonProperty("Capacity II")
	public String capacityII;
	@JsonProperty("Capacity III")
	public String capacityIII;
	@JsonProperty("Capacity")
	public String capacity;
	@JsonProperty("Bus Speed")
	public String busSpeed;
	@JsonProperty("Expansion")
	public String expansion;

}
