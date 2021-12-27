package com.mobilephone.portal.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_EMPTY)
public class PhoneDto {
	
	private String phoneId;
	private String owner;
	private String brand;
	private String model;
	private String version;
	private Technology techonology;
	private String _2gBands;
	private String _3gBands;
	private String _4gBands;
	private boolean isAvailable;
	private LocalDateTime bookingDate;
	
}
