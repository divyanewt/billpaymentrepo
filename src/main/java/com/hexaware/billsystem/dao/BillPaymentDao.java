package com.hexaware.billsystem.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BillPaymentDao {
	@Autowired
	SessionFactory sf;

}
