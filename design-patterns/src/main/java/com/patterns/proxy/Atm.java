




package com.patterns.proxy;





public class Atm implements Account {

    BankAccount bankAccount = new BankAccount();





    @Override
    public void withdraw() {

        bankAccount.withdraw();
    }





    @Override
    public void getAccountNumber() {

        bankAccount.getAccountNumber();
    }
}
