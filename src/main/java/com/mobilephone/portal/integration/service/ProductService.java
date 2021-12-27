package com.mobilephone.portal.integration.service;

import com.mobilephone.portal.dto.ProductSearchResponseDto;
import com.mobilephone.portal.dto.ProductSpecificationResponseDto;

public interface ProductService {

	public ProductSearchResponseDto searchProduct(String productName);

	public ProductSpecificationResponseDto getProductSpecification(String productId);

}
