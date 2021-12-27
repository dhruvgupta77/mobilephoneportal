package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Yes {
	@JsonProperty("Audio")
	public Audio audio;
	@JsonProperty("Experiences")
	public Experiences experiences;
	@JsonProperty("Peripheral(s)")
	public PeripheralS peripheralS;
	@JsonProperty("Port(s)")
	public PortS portS;
}