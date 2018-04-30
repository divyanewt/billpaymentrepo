package com.hexaware.billsystem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reg_vendor")
public class Vendor
{
	 @Id
		@GeneratedValue(strategy=GenerationType.AUTO)	
private int id;
private String name;
private int company_reg_no;
private String vendor_type;
private String address;
private String country;
private String state;
private String email;
private long contact_number;
private String web_site;
private Date certificate_issued_date;
private Date certificate_validity_date;
private int employee_count;
private int customer_count;
private int yoe;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCompany_reg_no() {
	return company_reg_no;
}
public void setCompany_reg_no(int company_reg_no) {
	this.company_reg_no = company_reg_no;
}
public String getVendor_type() {
	return vendor_type;
}
public void setVendor_type(String vendor_type) {
	this.vendor_type = vendor_type;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContact_number() {
	return contact_number;
}
public void setContact_number(long contact_number) {
	this.contact_number = contact_number;
}
public String getWeb_site() {
	return web_site;
}
public void setWeb_site(String web_site) {
	this.web_site = web_site;
}
public Date getCertificate_issued_date() {
	return certificate_issued_date;
}
public void setCertificate_issued_date(Date certificate_issued_date) {
	this.certificate_issued_date = certificate_issued_date;
}
public Date getCertificate_validity_date() {
	return certificate_validity_date;
}
public void setCertificate_validity_date(Date certificate_validity_date) {
	this.certificate_validity_date = certificate_validity_date;
}
public int getEmployee_count() {
	return employee_count;
}
public void setEmployee_count(int employee_count) {
	this.employee_count = employee_count;
}
public int getCustomer_count() {
	return customer_count;
}
public void setCustomer_count(int customer_count) {
	this.customer_count = customer_count;
}
public int getYoe() {
	return yoe;
}
public void setYoe(int yoe) {
	this.yoe = yoe;
}


}
