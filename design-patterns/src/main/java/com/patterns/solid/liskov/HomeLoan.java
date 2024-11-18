package com.patterns.solid.liskov;

public class HomeLoan implements ForceLoanPayment {

    @Override
    public void doPayment(int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doPayment'");
    }

    @Override
    public void forceCloseLoan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forceCloseLoan'");
    }
    
}
