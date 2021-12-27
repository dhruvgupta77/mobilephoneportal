package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Camera {

	@JsonProperty("Back Camera")
	private BackCamera backCamera;
	@JsonProperty("Back Camera II")
	private BackCameraII backCameraII;
	@JsonProperty("Back Camera III")
	private BackCameraIII backCameraIII;
	@JsonProperty("Back Camera IV")
	private BackCameraIV backCameraIV;
	@JsonProperty("Back Camera V")
	private BackCameraV backCameraV;
	@JsonProperty("Front Camera")
	private FrontCamera frontCamera;
	@JsonProperty("Front Camera II")
	private FrontCameraII frontCameraII;
	@JsonProperty("Front Camera III")
	private FrontCameraIII frontCameraIII;

}
