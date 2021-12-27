package com.mobilephone.portal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobilephone.portal.dto.OrderDto;
import com.mobilephone.portal.exception.ConstraintViolationException;
import com.mobilephone.portal.service.PhoneService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/mobCnt")
public class MobilePhoneController {

	private PhoneService phoneService;

	public MobilePhoneController(PhoneService phoneService) {
		this.phoneService = phoneService;
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> getAllPhones() {
		log.info("Going to get all phones");
		return new ResponseEntity<>(phoneService.getAllPhones(), HttpStatus.OK);
	}

	@PostMapping(path = "/bookPhone")
	public ResponseEntity<?> bookPhone(@RequestBody OrderDto orderDto) {
		log.info("Going to book phone");
		try {
			return new ResponseEntity<>(phoneService.bookPhone(orderDto), HttpStatus.OK);
		} catch (ConstraintViolationException ce) {
			final String errorMsg = "Invalid Request: Bad order details passed";
			log.error(errorMsg);
			return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(path = "/returnPhone/{orderId}")
	public ResponseEntity<?> returnPhone(@PathVariable(name = "orderId") final Long orderId) {
		log.info("Going to return phone");
		try {
			return new ResponseEntity<>(phoneService.returnPhone(orderId), HttpStatus.OK);
		} catch (ConstraintViolationException ce) {
			final String errorMsg = "Invalid Request: Bad order id passed: " + orderId;
			log.error(errorMsg);
			return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
		}
	}

}
