package com.mobilephone.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilephone.portal.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
