package com.loan;

import java.util.ArrayList;
import java.util.List;

public class LoanStore {

	
	private List<Loan> loans = new ArrayList<>();

    public LoanStore() {
        loans = new ArrayList<>();
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public boolean validatePaymentDate(Loan loan) {
    	if(loan == null || loan.getPaymentDate() == null || loan.getDueDate() == null)
    	{
    		return false;
    	}
        return loan.getPaymentDate().compareTo(loan.getDueDate()) <= 0;
       
   }

}