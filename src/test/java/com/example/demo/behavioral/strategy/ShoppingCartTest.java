package com.example.demo.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    public void addItemAndPay() {

        Item pen = new Item("Pen", 20);
        PaymentStrategy creditCard = new CreditCardStrategy();
        PaymentStrategy paypal = new PaypalStrategy();
        ShoppingCart cartWithCreditCard = new ShoppingCart(creditCard);
        ShoppingCart cartWithPaypal = new ShoppingCart(paypal);

        assertEquals(cartWithCreditCard.pay(), "Payment done by credit card.");
        assertEquals(cartWithPaypal.pay(), "Payment done by Paypal.");
    }
}