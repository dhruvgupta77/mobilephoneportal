package com.mobilephone.portal.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mobilephone.portal.dto.AvailableMobilePhones;
import com.mobilephone.portal.dto.OrderDto;
import com.mobilephone.portal.dto.PhoneDto;
import com.mobilephone.portal.dto.Product;
import com.mobilephone.portal.dto.ProductSearchResponseDto;
import com.mobilephone.portal.dto.ProductSpecificationResponseDto;
import com.mobilephone.portal.dto.Result;
import com.mobilephone.portal.dto.Technology;
import com.mobilephone.portal.entity.Order;
import com.mobilephone.portal.entity.OrderStatus;
import com.mobilephone.portal.exception.ConstraintViolationException;
import com.mobilephone.portal.exception.ConstraintViolationException.Problem;
import com.mobilephone.portal.integration.service.ProductService;
import com.mobilephone.portal.repository.CustomerRepository;
import com.mobilephone.portal.repository.OrderRepository;
import com.mobilephone.portal.service.PhoneService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PhoneServiceImpl implements PhoneService {

	private ProductService prouductService;
	private OrderRepository orderRepository;
	private CustomerRepository customerRepository;

	public PhoneServiceImpl(ProductService prouductService, OrderRepository orderRepository,
			CustomerRepository customerRepository) {
		super();
		this.prouductService = prouductService;
		this.orderRepository = orderRepository;
		this.customerRepository = customerRepository;
	}

	@Override
	public List<PhoneDto> getAllPhones() {
		AvailableMobilePhones[] availablePhones = AvailableMobilePhones.values();
		List<PhoneDto> mobilePhoneList = new ArrayList<>();

		for (AvailableMobilePhones phone : availablePhones) {
			ProductSearchResponseDto productSearchRes = prouductService.searchProduct(phone.getName());
			if (productSearchRes.getSuccess() == 1 && !productSearchRes.getData().getResults().isEmpty()) {
				List<Result> resList = productSearchRes.getData().getResults();
				for (Result res : resList) {
					String phoneId = res.get_meta().getId();

					ProductSpecificationResponseDto productData = getProductDetails(phoneId);
					if (productData != null) {
						List<Product> productList = productData.getData().getProduct();
						for (Product product : productList) {
							PhoneDto phoneDto = new PhoneDto();
							phoneDto.setBrand(product.getProduct().getBrand());
							phoneDto.setModel(product.getProduct().getModel());
							phoneDto.setVersion(product.getProduct().getVersion());
							phoneDto.setPhoneId(phoneId);

							phoneDto.set_2gBands(product.getInside().getCellular().getSIMIIFrequencies());
							phoneDto.set_3gBands(product.getInside().getCellular().getSIMFrequencies());
							phoneDto.set_4gBands(product.getInside().getCellular().getSIMIIMobileData());
							phoneDto.setAvailable(phone.getQty() > 0);

							Technology technology = new Technology();
							technology.setCamera(product.getCamera());
							technology.setProcessor(product.getInside().getProcessor());
							technology.setSensor(product.getInside().getSensorS());
							technology.setSoftware(product.getInside().getSoftware());
							technology.setStorage(product.getInside().getStorage());
							technology.setWireless(product.getInside().getWireless());
							phoneDto.setTechonology(technology);

							mobilePhoneList.add(phoneDto);
						}
					}
				}
			}
		}

		return mobilePhoneList;
	}

	private ProductSpecificationResponseDto getProductDetails(String phoneId) {
		return prouductService.getProductSpecification(phoneId);
	}

	@Override
	public boolean bookPhone(OrderDto orderDto) {
		validateOrder(orderDto);
		//TOOO: It is assumed that phone is always available. Itineraries needs to be managed and handled
		Order order = Order.builder().customer(customerRepository.getById(orderDto.getCustomerId()))
				.phoneId(orderDto.getPhoneId()).qty(orderDto.getQty()).bookingDate(LocalDateTime.now())
				.status(OrderStatus.builder().id(1L).build()).isReturned(false).build();
		orderRepository.save(order);
		log.info("Order persisted");
		return true;
	}

	private void validateOrder(OrderDto orderDto) {

		List<Problem> problems = new ArrayList<>();

		if (orderDto.getCustomerId() == null)
			problems.add(new Problem("customerId", "invalid.property", new Object[] { "Order", "customerId" }));

		if (orderDto.getPhoneId() == null)
			problems.add(new Problem("phoneId", "invalid.property", new Object[] { "Order", "phoneId" }));

		if (orderDto.getQty() < 0)
			problems.add(new Problem("quantity", "invalid.property", new Object[] { "Order", "quantity" }));

		if (getProductDetails(orderDto.getPhoneId()) == null)
			problems.add(
					new Problem("phoneId", "invalid.phoneId.not.found.property", new Object[] { "Order", "phoneId" }));

		if (!customerRepository.findById(orderDto.getCustomerId()).isPresent())
			problems.add(new Problem("customerId", "invalid.customerId.not.found.property",
					new Object[] { "Order", "customerId" }));

		if (!problems.isEmpty())
			throw new ConstraintViolationException(problems);

	}

	@Override
	public boolean returnPhone(Long orderId) {
		validateOrderId(orderId);

		orderRepository.findById(orderId).ifPresent(order -> {
			order.setReturned(true);
			orderRepository.save(order);
		});

		return true;
	}

	private void validateOrderId(Long id) {

		List<Problem> problems = new ArrayList<>();

		if (id == null || id < 0)
			problems.add(new Problem("id", "invalid.property", new Object[] { "Order", "id" }));
		else if (!orderRepository.findById(id).isPresent())
			problems.add(new Problem("id", "invalid.id.not.found", new Object[] { "Order" }));

		if (!problems.isEmpty())
			throw new ConstraintViolationException(problems);
	}

}
