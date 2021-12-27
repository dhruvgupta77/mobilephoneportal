package com.mobilephone.portal.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class MobilePhoneControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	void shouldReturnEmptyListWhenNoProductExist() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/mobCnt/findAll")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON));
	}

	@Test
	void shouldReturn404WhenOrderIdIsInvalidForReturningPhoneApi() throws Exception {
		mvc.perform(MockMvcRequestBuilders.put("/mobCnt/returnPhone/null")).andExpect(status().isBadRequest());

	}
	
	@Test
	void shouldReturn404WhenOrderDetailsAreInvalidForBookingPhoneApi() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/mobCnt/bookPhone")).andExpect(status().isBadRequest());
	}
	



}
