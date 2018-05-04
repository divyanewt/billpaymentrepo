package com;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.hexaware.billsystem")
@EntityScan("com.hexaware.billsystem")
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

