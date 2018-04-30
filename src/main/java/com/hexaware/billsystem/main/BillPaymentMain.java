package com.hexaware.billsystem.main;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BillPaymentMain 
{
	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hem)
	{
		return hem.getSessionFactory();
		
	}
	public static void main(String[] args) {
		SpringApplication.run(BillPaymentMain.class,args);
		
	}

	
}

