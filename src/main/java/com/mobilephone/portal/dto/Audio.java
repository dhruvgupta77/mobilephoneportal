package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Audio {

	@JsonProperty("Module")
	private String module;
	@JsonProperty("Output")
	private String output;
	@JsonProperty("Channel")
	private String channel;
	@JsonProperty("AV Resolution")
	private String aVResolution;
	@JsonProperty("ADC Frequency")
	private String aDCFrequency;
	@JsonProperty("ADC Resolution")
	private String aDCResolution;
	@JsonProperty("DAC Frequency")
	private String dACFrequency;
	@JsonProperty("DAC Resolution")
	private String dACResolution;
	@JsonProperty("Loudspeaker Power")
	private String loudspeakerPower;
	@JsonProperty("Loudspeaker(s)")
	private String loudspeakerS;
	@JsonProperty("AV Out")
	private String aVOut;
	@JsonProperty("Hearing Aid Compatibility")
	private String hearingAidCompatibility;
	@JsonProperty("Microphone(s)")
	private String microphoneS;
	@JsonProperty("Microphone Input")
	private String microphoneInput;

}
