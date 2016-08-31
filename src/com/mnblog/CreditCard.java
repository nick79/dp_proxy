package com.mnblog;

/**
 * Created by Milan.Nikic on 8/31/2016.
 */
public class CreditCard implements Payable {

    private Account account;

    public CreditCard(String panNumber, String cvvNumber) {
        account = authenticate(panNumber, cvvNumber);
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Credit card used to pay amount %f\n", amount);
        account.pay(amount);
    }

    private Account authenticate(String panNumber, String cvvNumber) {
        System.out.printf("Authenticate account for PAN: %s and CVV %s\n", panNumber, cvvNumber);
        return new Account("12345");
    }
}
