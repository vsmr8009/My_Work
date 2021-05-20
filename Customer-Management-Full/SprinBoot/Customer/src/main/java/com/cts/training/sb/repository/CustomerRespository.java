package com.cts.training.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.sb.bean.Customer;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Long> {

}
