package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Battery {

	@JsonProperty("Type")
	private String type;
	@JsonProperty("Style")
	private Object style;
	@JsonProperty("Capacity")
	private String capacity;
	@JsonProperty("Cell I")
	private String cellI;
	@JsonProperty("Cell II")
	private String cellII;
	@JsonProperty("Standby Time")
	private String standbyTime;
	@JsonProperty("Talk Time")
	private String talkTime;
	@JsonProperty("Life")
	private String life;
	@JsonProperty("Current")
	private String current;
	@JsonProperty("Standby Current Consumption")
	private String standbyCurrentConsumption;
	@JsonProperty("Wireless Charging Power")
	private String wirelessChargingPower;
	@JsonProperty("Charging Power")
	private String chargingPower;
	@JsonProperty("Energy")
	private String energy;
	@JsonProperty("Voltage")
	private String voltage;
	@JsonProperty("Power IC")
	private String powerIC;
	@JsonProperty("Wireless Charging")
	private String wirelessCharging;

}
