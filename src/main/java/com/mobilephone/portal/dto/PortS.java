package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PortS {
	@JsonProperty("USB Type")
	private String uSBType;
	@JsonProperty("USB Version")
	private String uSBVersion;
	@JsonProperty("USB Feature(s)")
	private String uSBFeatureS;
	@JsonProperty("USB Type (Port II)")
	private String uSBTypePortII;
	@JsonProperty("USB Version (Port II)")
	private String uSBVersionPortII;
	@JsonProperty("USB Features (Port II)")
	private String uSBFeaturesPortII;
	@JsonProperty("Modem")
	private String modem;
	@JsonProperty("Modem Standard")
	private String modemStandard;
	@JsonProperty("Ethernet Standard")
	private String ethernetStandard;
	@JsonProperty("Ethernet")
	private String ethernet;
	@JsonProperty("Serial Standard")
	private String serialStandard;
	@JsonProperty("Serial Connector")
	private String serialConnector;
	@JsonProperty("Serial Bit Rate")
	private String serialBitRate;
	@JsonProperty("Fax Modem Standard")
	private String faxModemStandard;

}
