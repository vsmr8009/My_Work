package com.cts.practise.msms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.practise.msms.dto.SaleItemDto;
import com.cts.practise.msms.service.SaleItemService;

@Controller
public class SaleItemController {
	
	@Autowired
	private SaleItemService saleItemService;
	
	@RequestMapping("/new-sale")
	public String saleForm() {
		return "sales-form";
	}
	
	@RequestMapping(value = "/add-sale", method = RequestMethod.POST)
	public String addSale(@ModelAttribute("saleItemDto") SaleItemDto saleItemDto) {
		saleItemService.addSale(saleItemDto);
		return "redirect:/home";
	}
}
