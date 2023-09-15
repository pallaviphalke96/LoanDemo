package com.loan;


public class LoanApp
{
    public static void main(String[] args)
    {
        
        LoanStore loanStore = new LoanStore();

        Loan loan1 = new Loan();
        loan1.setCustomer("Customer1");
        loan1.setLender("Lender1");
        loan1.setPaymentDate("2023-06-05"); 
        loan1.setDueDate("2023-07-05"); 
      
        loan1.setAmount(10000);
        loan1.setRemainingAmount(10000);
        loan1.setPenaltyDay(1);
        loan1.setCanceled(false);
        
        Loan loan2 = new Loan();
        loan2.setCustomer("Customer2");
        loan2.setLender("Lender2");
        
        loanStore.addLoan(loan1);
        loanStore.addLoan(loan2);

//        System.out.println("Payment Date for Loan 1: " + loan1.getPaymentDate());
//        System.out.println("Due Date for Loan 1: " + loan1.getDueDate());
//        
        System.out.println("Number of loans in the store: " + loanStore.getLoans().size());

        if (loanStore.validatePaymentDate(loan1))
        {
            System.out.println("Payment date for loan 1 is valid.");
        } else {
            System.out.println("Payment date for loan 1 is invalid.");
        }
    }
}
