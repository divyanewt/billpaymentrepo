package com.hexaware.billsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.billsystem.dao.VendorDao;

@Service
public class CustomerService {
	@Autowired
	VendorDao payDao;

}
