package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Cellular {

	@JsonProperty("Dual Sim Type")
	private String dualSimType;
	@JsonProperty("SIM Module")
	private String sIMModule;
	@JsonProperty("SIM Slot")
	private String sIMSlot;
	@JsonProperty("SIM Frequencies")
	private String sIMFrequencies;
	@JsonProperty("SIM Mobile Data")
	private String sIMMobileData;
	@JsonProperty("SIM II Module")
	private String sIMIIModule;
	@JsonProperty("SIM II Slot")
	private String sIMIISlot;
	@JsonProperty("SIM II Frequencies")
	private String sIMIIFrequencies;
	@JsonProperty("SIM II Mobile Data")
	private String sIMIIMobileData;

}
