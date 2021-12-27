package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Processor {

	@JsonProperty("CPU")
	private String cPU;
	@JsonProperty("CPU Clock Speed")
	private String cPUClockSpeed;
	@JsonProperty("GPU")
	private String gPU;
	@JsonProperty("GPU Clock Speed")
	private String gPUClockSpeed;
	@JsonProperty("GPU Dedicated Memory")
	private String gPUDedicatedMemory;
	@JsonProperty("GPU Framebuffer")
	private String gPUFramebuffer;
}
