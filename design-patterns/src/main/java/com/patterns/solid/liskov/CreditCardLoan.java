package com.patterns.solid.liskov;

public class CreditCardLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {
        throw new UnsupportedOperationException("Unimplemented method 'doPayment'");
    }
    
}
