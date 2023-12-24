package com.cts.training.msms.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.training.msms.entity.Customer;
import com.cts.training.msms.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
	
	Sales findByCustomer(Customer customer);
	
	@Query(value= "select * from sales where customer_id=:customerId",nativeQuery = true)
	List<Sales> findSalesByCustomer(@Param("customerId") Long customerId);
	
	@Query(value = "SELECT * from sales where date>= :startDate and date<= :endDate", nativeQuery = true)
	List<Sales> getAllBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
