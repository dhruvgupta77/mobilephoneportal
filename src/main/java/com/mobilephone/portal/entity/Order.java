package com.mobilephone.portal.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "phone_id")
	private String phoneId;
	
	@Column(name = "quantity")
	private int qty;
	
	@Column(name = "booking_date")
	private LocalDateTime bookingDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_status_id")
	private OrderStatus status;
	
	@Column(name = "is_returned")
	private boolean isReturned;

}
