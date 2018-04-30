package com.hexaware.billsystem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bill_payment")
public class BillPayment
{
	 @Id
		@GeneratedValue(strategy=GenerationType.AUTO)	
private int id;
private int customerId;
private String vendorType;
private String vendorName;
private Double pendingAmount;
private Date paymentDate;
private double amountPay;
private String cardType;
private Integer cardNumber;
private Integer confirmCardNumber;
private Date cardValidity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getVendorType() {
	return vendorType;
}
public void setVendorType(String vendorType) {
	this.vendorType = vendorType;
}
public String getVendorName() {
	return vendorName;
}
public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}
public Double getPendingAmount() {
	return pendingAmount;
}
public void setPendingAmount(Double pendingAmount) {
	this.pendingAmount = pendingAmount;
}
public Date getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}
public double getAmountPay() {
	return amountPay;
}
public void setAmountPay(double amountPay) {
	this.amountPay = amountPay;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public Integer getCardNumber() {
	return cardNumber;
}
public void setCardNumber(Integer cardNumber) {
	this.cardNumber = cardNumber;
}
public Integer getConfirmCardNumber() {
	return confirmCardNumber;
}
public void setConfirmCardNumber(Integer confirmCardNumber) {
	this.confirmCardNumber = confirmCardNumber;
}
public Date getCardValidity() {
	return cardValidity;
}
public void setCardValidity(Date cardValidity) {
	this.cardValidity = cardValidity;
}

}
