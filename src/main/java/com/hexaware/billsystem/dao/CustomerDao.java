package com.hexaware.billsystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hexaware.billsystem.model.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sf;

	public int registerCustomer(Customer customer)
	{
		int status=0;
		Session session= sf.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		status=(int) session.save(customer);
		tx.commit();
		if(status>1)
		return 1;
		else
			return 0;

	}

	public Customer getCustomerById(int id)
	{
		System.out.println("dao");
		Session session= sf.openSession();
		Query qry= session.createQuery("Select c from Customer c where c.custId=?");
		System.out.println("daonext");
		qry.setParameter(0, id);
		List<Customer> li = qry.list();
		Customer customer=(Customer)li.get(0);
		return customer;

	}
	public void updateCustomer(Customer customer)
	{
		Session session= sf.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		session.update(customer);
		tx.commit();

	}
	public List<Customer> getListCustomer()
	{
		Session session= sf.openSession();
		Query qry= session.createQuery("Select e from Customer e");
		List<Customer> customer = qry.list();
		return customer;
	}


	public int deleteCustomer( int id)
	{
		Session session= sf.openSession();
		Query qry= session.createQuery("delete from Customer c where c.custId=?");
		qry.setParameter(0, id);
		int result=qry.executeUpdate();
		return result;

	}
}
