package com.cts.practise.msms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.practise.msms.model.SaleItem;

@Repository
public class SaleItemDaoImpl implements SaleItemDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public void addSaleItem(SaleItem saleItem) {
		hibernateTemplate.save(saleItem);

	}

}
