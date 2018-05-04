package com.hexaware.billsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.billsystem.model.Vendor;
import com.hexaware.billsystem.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController 
{
	@Autowired
	VendorService billService;

	@RequestMapping(value="/createVendor",consumes = "application/json", produces = "application/json",method=RequestMethod.POST)
	public int regVendorController(@RequestBody Vendor vendor) {
		System.out.println(vendor.getId()+vendor.getAddress()+"detail");
		return billService.regVendorService(vendor);
	}
	
	@RequestMapping(value="/getVendorList", produces = "application/json")
	public List<Vendor> getAllVendorController(){
		return billService.getAllVendorService();
	}
	
	@RequestMapping(value="/getVendorById/{id}", produces = "application/json",method=RequestMethod.GET)
	
	public @ResponseBody Vendor getVendorByIdController(@PathVariable("id") int id) {
		return billService.getVendorByIdService(id);
	}
	
	@RequestMapping(value="/updateVendor",consumes = "application/json", produces = "application/json",method=RequestMethod.PUT)
	public void updateVendorController(@RequestBody Vendor vendor) {
		billService.updateVendorService(vendor);
	}
	
	@RequestMapping(value="/deleteVendor/{id}",method=RequestMethod.DELETE)
	public void deleteVendorController(@PathVariable("id") int id) {
		billService.deleteVendorService(id);
	}
	
	
}
