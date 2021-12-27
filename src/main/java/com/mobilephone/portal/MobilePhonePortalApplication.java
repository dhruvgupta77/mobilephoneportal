package com.mobilephone.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class MobilePhonePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhonePortalApplication.class, args);
		log.info("################Application Started#####################");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
