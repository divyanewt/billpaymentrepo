package com.hexaware.billsystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.billsystem.model.Vendor;

@Repository
public class VendorDao {
	@Autowired
	SessionFactory sf;
	
	public int registerVendor(Vendor vendor) {
		int status=0;
		Session session= sf.openSession();
		Transaction tran=session.getTransaction();
		tran.begin();
		status = (int) session.save(vendor);
		tran.commit();
		if(status>0) {
			return status;
		}
		return status;
	}
	
	public List<Vendor> getAllVendor(){
		Session session= sf.openSession();
		Query qry= session.createQuery("select e from Vendor e");
		List<Vendor>listVendor=qry.list();
		if(listVendor!=null) {
			return listVendor;
		}
		
		return null;
	}
	
	public Vendor getVendorById(int id) {
		Session session= sf.openSession();
		Query qry= session.createQuery("select e from Vendor e where e.id=?");
		qry.setParameter(0, id);
		
		 List<Vendor> e=  qry.list();
		 Vendor vendor=e.get(0);
		return vendor;
	}
	
	public void updateVendor(Vendor vendor) {
		
		Session session= sf.openSession();
		Transaction tran=session.getTransaction();
		tran.begin();
		 session.update(vendor);
		tran.commit();
		
	}
	
	public void deleteVendor(int id) {
		Session session= sf.openSession();
		Query query = session.createQuery("delete  from Vendor v where v.id=? ");
		query.setParameter(0, id);
		 
		int result = query.executeUpdate();
		
		
		
	}

}
