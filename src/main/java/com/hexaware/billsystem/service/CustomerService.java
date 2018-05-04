package com.hexaware.billsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.billsystem.dao.CustomerDao;
import com.hexaware.billsystem.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao cdao;
	
	public int regCustService(Customer customer)
	{
		return cdao.registerCustomer(customer);
		
	}
	
   public Customer getCustByIdService(int id)
   {
	   System.out.println("service");
	return cdao.getCustomerById(id);
	   
   }
   public void updateCustService(Customer customer)
   {
	cdao.updateCustomer(customer);
	   
   }
   public List<Customer> getCustListService()
   {
	return cdao.getListCustomer();
   }
   
   public int deleteCustomerService( int id)
   {
	return cdao.deleteCustomer(id);
	   
   }
}
