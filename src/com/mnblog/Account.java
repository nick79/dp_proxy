package com.mnblog;

/**
 * Created by Milan.Nikic on 8/31/2016.
 */
public class Account implements Payable {

    private String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        // do some heavy implementation - check available amount, balance the account etc...
        System.out.printf("Amount %f transferred to account number: %s\n", amount, accountNumber);
    }
}
