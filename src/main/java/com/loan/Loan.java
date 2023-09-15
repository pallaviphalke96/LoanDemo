package com.loan;

public class Loan {

	private String customer;
    private String lender;
    private String lent;
    private String leni;
    private double amount;
    private double remainingAmount;
    private String paymentDate;
    private String dueDate;
    private int penaltyDay;
    private boolean isCanceled;
    
    
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public String getLent() {
		return lent;
	}
	public void setLent(String lent) {
		this.lent = lent;
	}
	public String getLeni() {
		return leni;
	}
	public void setLeni(String leni) {
		this.leni = leni;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public int getPenaltyDay() {
		return penaltyDay;
	}
	public void setPenaltyDay(int penaltyDay) {
		this.penaltyDay = penaltyDay;
	}
	public boolean isCanceled() {
		return isCanceled;
	}
	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}
	
	
	public Loan() 
	{
		
	}
	public Loan(String customer, String lender, String lent, String leni, double amount, double remainingAmount,
			String paymentDate, String dueDate, int penaltyDay, boolean isCanceled) {
		
		this.customer = customer;
		this.lender = lender;
		this.lent = lent;
		this.leni = leni;
		this.amount = amount;
		this.remainingAmount = remainingAmount;
		this.paymentDate = paymentDate;
		this.dueDate = dueDate;
		this.penaltyDay = penaltyDay;
		this.isCanceled = isCanceled;
	}
    
    
}
