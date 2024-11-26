




package com.patterns.proxy;





public class UpiAccount implements Account {

    private BankAccount bankAccount;





    @Override
    public void withdraw() {

        bankAccount.withdraw();
    }





    @Override
    public void getAccountNumber() {

        bankAccount.getAccountNumber();
    }
}
