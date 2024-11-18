package com.patterns.solid.s;

public class Account {
    int amount = 0 ;

    void updateAmount(int amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount;
    }
}
