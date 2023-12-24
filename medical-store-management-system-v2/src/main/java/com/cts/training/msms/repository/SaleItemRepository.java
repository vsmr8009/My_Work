package com.cts.training.msms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.msms.entity.SaleItem;

@Repository
public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {

}
