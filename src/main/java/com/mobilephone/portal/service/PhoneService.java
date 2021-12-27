package com.mobilephone.portal.service;

import java.util.List;

import com.mobilephone.portal.dto.OrderDto;
import com.mobilephone.portal.dto.PhoneDto;

public interface PhoneService {
	
	public List<PhoneDto> getAllPhones();
	
	public boolean bookPhone(OrderDto order);
	
	public boolean returnPhone(Long orderId);

}
