package com.hexaware.billsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexaware.billsystem.model.Vendor;
import com.hexaware.billsystem.service.VendorService;

@Controller
public class VendorController 
{
	@Autowired
	VendorService billService;

	@RequestMapping(value="/vendor")
	public int regVendorController(Vendor vendor) {
		return billService.regVendorService(vendor);
	}
	
	@RequestMapping(value="/custList/")
	public List<Vendor> getAllVendorController(){
		return billService.getAllVendorService();
	}
	
	@RequestMapping(value="/custById/{id}")
	public Vendor getVendorByIdController(@PathVariable("id") int id) {
		return billService.getVendorByIdService(id);
	}
	
	@RequestMapping(value="/updateVendor")
	public void updateVendorController(Vendor vendor) {
		billService.updateVendorService(vendor);
	}
	
	@RequestMapping(value="/deleteVendor/{id}")
	public void deleteVendorController(@PathVariable("id") int id) {
		billService.deleteVendorService(id);
	}
}
