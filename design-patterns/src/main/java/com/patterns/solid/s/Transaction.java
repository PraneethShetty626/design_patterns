package com.patterns.solid.s;

public class Transaction {
    void addAmount(Account account, int amount) {
        account.updateAmount(amount);
    }

    void removeAmount(Account account , int amount) {
        account.updateAmount(amount-account.getAmount());
    }
}
