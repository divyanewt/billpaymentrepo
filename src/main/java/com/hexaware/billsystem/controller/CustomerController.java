package com.hexaware.billsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hexaware.billsystem.service.VendorService;

@Controller
public class CustomerController 
{
	@Autowired
	VendorService billService;

}
