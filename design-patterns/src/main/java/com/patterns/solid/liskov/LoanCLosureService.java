package com.patterns.solid.liskov;

public class LoanCLosureService {
    public ForceLoanPayment loanPayment;

    public LoanCLosureService(ForceLoanPayment forceCloseLoan) {
        loanPayment = forceCloseLoan;
    }

    public void forceCloseLoan() {
        loanPayment.forceCloseLoan();
    }
}
