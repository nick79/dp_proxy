package com.mnblog;

/**
 * Created by Milan.Nikic on 8/31/2016.
 */
public class ProxyDemo {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123-123-123", "321");
        creditCard.pay(1.0);
    }
}
