package com.hexaware.billsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.billsystem.model.Customer;
import com.hexaware.billsystem.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@RequestMapping(value="/regcustomer", method=RequestMethod.POST)
	public String regCustController(@RequestBody Customer customer)
	{
		int i=cs.regCustService(customer);
		if (i>0) {
		return "Success";
		}
		else
			return "failure";
	}
	
	@RequestMapping(value="/getCustomerById/{id}")
   public Customer getCustByIdController(@PathVariable("id") int id)
   {
		System.out.println("controller");
	return cs.getCustByIdService(id);
	   
   }
	 @RequestMapping(value="/updateCustomer", method=RequestMethod.PUT)
   public void updateCustController(@RequestBody Customer customer)
   {
		 System.out.println("Success");
		 cs.updateCustService(customer);
	   
   }
   @RequestMapping(value="/getCustomerList", method=RequestMethod.GET)
   public List<Customer> getCustomerList()
   {
	   return cs.getCustListService();
   }
   
   @RequestMapping(value="/deleteCustomer/{id}")
   public int deleteCustomerController(@PathVariable("id") int id)
   {
	return cs.deleteCustomerService(id);
	   
   }
}
