package com.hexaware.billsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor_type")
public class VendorType
{
 @Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int company_reg_no;
private String vendor_name;
private String vendor_type;
public int getCompany_reg_no() {
	return company_reg_no;
}
public void setCompany_reg_no(int company_reg_no) {
	this.company_reg_no = company_reg_no;
}
public String getVendor_name() {
	return vendor_name;
}
public void setVendor_name(String vendor_name) {
	this.vendor_name = vendor_name;
}
public String getVendor_type() {
	return vendor_type;
}
public void setVendor_type(String vendor_type) {
	this.vendor_type = vendor_type;
}

}
