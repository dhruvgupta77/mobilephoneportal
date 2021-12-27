package com.mobilephone.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilephone.portal.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
