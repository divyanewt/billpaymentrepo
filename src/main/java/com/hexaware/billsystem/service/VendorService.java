package com.hexaware.billsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexaware.billsystem.dao.VendorDao;
import com.hexaware.billsystem.model.Vendor;

@Service
public class VendorService {
	@Autowired
	VendorDao payDao;
	
	
	public int regVendorService(Vendor vendor) {
		return payDao.registerVendor(vendor);
	}
	
	public List<Vendor> getAllVendorService(){
		return payDao.getAllVendor();
	}
	

	public Vendor getVendorByIdService(int id) {
		return payDao.getVendorById(id);
	}
	
	public void updateVendorService(Vendor vendor) {
		payDao.updateVendor(vendor);
	}
	
	public void deleteVendorService(int id) {
		payDao.deleteVendor(id);
	}
	
}
