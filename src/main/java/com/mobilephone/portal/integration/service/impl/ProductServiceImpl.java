package com.mobilephone.portal.integration.service.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.mobilephone.portal.dto.ProductSearchResponseDto;
import com.mobilephone.portal.dto.ProductSpecificationResponseDto;
import com.mobilephone.portal.integration.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

	private static final String TECH_SPECS_API = "https://apis.dashboard.techspecs.io/e2t2fcqhn624qcjz/api/product/";
	private static final String X_BLOBR_KEY = "BmKYXw3iFS2oM9BjAjdMQVAo6Gs13Zn9";
	private RestTemplate restTemplate;

	public ProductServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public ProductSearchResponseDto searchProduct(String productName) {

		HttpHeaders headers = builtHeader();

		Map<String, String> requestBody = new HashMap<>();
		requestBody.put("category", "smartphone");
		final HttpEntity<?> postEntity = new HttpEntity<>(requestBody, headers);
		ResponseEntity<ProductSearchResponseDto> entity = null;

		String prName = productName.replace(" ", "%2520");
		String urlStr = new StringBuilder(TECH_SPECS_API).append("search?query=").append(prName).toString();
		ProductSearchResponseDto productSearchResponseDto = null;

		try {
			URI url = new URI(urlStr);
			log.debug("URL==========" + url.toString());
			entity = restTemplate.postForEntity(url, postEntity, ProductSearchResponseDto.class);
			productSearchResponseDto = entity.getBody();
			return productSearchResponseDto;
		} catch (URISyntaxException e) {
			log.error("URL Malformed exception: " + e.getMessage());
			e.printStackTrace();
		} catch (HttpClientErrorException ex) {
			log.error("++++++REACHED HERE: Exception Occured while searching product");
			int rawStatusCode = ex.getRawStatusCode();
			if (rawStatusCode == HttpStatus.UNAUTHORIZED.value() || rawStatusCode == HttpStatus.FORBIDDEN.value()) {
				log.error("++++++REACHED HERE: unaouthorized/forbidden: " + rawStatusCode);
			} else {
				log.error("++++++REACHED HERE: preparing auth response: " + rawStatusCode);
			}
			ex.printStackTrace();
		}

		return getDefaultProductSearchResponse();
	}

	private HttpHeaders builtHeader() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-BLOBR-KEY", X_BLOBR_KEY);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		return headers;

	}

	private ProductSearchResponseDto getDefaultProductSearchResponse() {
		return new ProductSearchResponseDto();
	}

	@Override
	public ProductSpecificationResponseDto getProductSpecification(String productId) {
		if (productId == null || "".equals(productId))
			return getDefaultProductSpecificationResponse();
		
		HttpHeaders headers = builtHeader();
		
		log.info("Product Id==========>" + productId);

		final HttpEntity<?> getEntity = new HttpEntity<>(headers);
		ResponseEntity<ProductSpecificationResponseDto> entity = null;

		String urlStr = new StringBuilder(TECH_SPECS_API).append("get/").append(productId).toString();
		ProductSpecificationResponseDto productSpecificationResponseDto = null;

		try {
			URI url = new URI(urlStr);
			log.debug("URL==========" + url.toString());
			entity = restTemplate.exchange(url, HttpMethod.GET, getEntity, ProductSpecificationResponseDto.class);
			productSpecificationResponseDto = entity.getBody();
			return productSpecificationResponseDto;
		} catch (URISyntaxException e) {
			log.error("URL Malformed exception: " + e.getMessage());
			e.printStackTrace();
		} catch (HttpClientErrorException ex) {
			log.error("++++++REACHED HERE: Exception Occured while getting product specification");
			int rawStatusCode = ex.getRawStatusCode();
			if (rawStatusCode == HttpStatus.UNAUTHORIZED.value() || rawStatusCode == HttpStatus.FORBIDDEN.value()) {
				log.error("++++++REACHED HERE: unaouthorized/forbidden: " + rawStatusCode);
			} else {
				log.error("++++++REACHED HERE: preparing auth response: " + rawStatusCode);
			}
			ex.printStackTrace();
		} catch (Throwable re) {//TODO: Remove it and handle the json parsing for all possible results
			log.error("Exception while getting product specification: " + productId);
			re.printStackTrace();
		}

		return null;
	}

	private ProductSpecificationResponseDto getDefaultProductSpecificationResponse() {
		return new ProductSpecificationResponseDto();
	}

}
