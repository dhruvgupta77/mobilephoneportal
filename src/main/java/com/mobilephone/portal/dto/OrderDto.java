package com.mobilephone.portal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_EMPTY)
public class OrderDto {

	private Long customerId;

	private String phoneId;

	private int qty;
	
}
