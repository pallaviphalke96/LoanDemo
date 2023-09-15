package com.loan;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoanStoreTest {

	private LoanStore loanStore;

    @Before
    public void setUp() {
        loanStore = new LoanStore();
    }

    @Test
    public void testAddLoan() {
        Loan loan = new Loan();
        loanStore.addLoan(loan);
        assertEquals(1, loanStore.getLoans().size());
    }

    @Test
    public void testValidatePaymentDateValid() {
        Loan loan = new Loan();
        assertTrue(loanStore.validatePaymentDate(loan));
    }

    @Test
    public void testValidatePaymentDateInvalid() {
        Loan loan = new Loan();
        assertFalse(loanStore.validatePaymentDate(loan));
    }

}
