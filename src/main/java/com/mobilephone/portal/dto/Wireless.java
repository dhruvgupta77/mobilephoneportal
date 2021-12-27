package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Wireless {

	@JsonProperty("Bluetooth Module")
	public String bluetoothModule;
	@JsonProperty("Bluetooth Version")
	public String bluetoothVersion;
	@JsonProperty("Bluetooth Profiles")
	public String bluetoothProfiles;
	@JsonProperty("WLAN Module")
	public String wLANModule;
	@JsonProperty("WiFi")
	public String wiFi;
	@JsonProperty("WMAN")
	public String wMAN;
	@JsonProperty("WiFi Feature(s)")
	public String wiFiFeatureS;
	@JsonProperty("Experience(s)")
	public String experienceS;
	@JsonProperty("FM Radio")
	public String fMRadio;
	@JsonProperty("FM Radio Transmitter")
	public String fMRadioTransmitter;
	@JsonProperty("Infrared")
	public String infrared;
	@JsonProperty("Analog TV")
	public String analogTV;
	@JsonProperty("NFC")
	public String nFC;
	@JsonProperty("Digital TV")
	public String digitalTV;

}
