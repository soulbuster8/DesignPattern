package com.example.demo.behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy{

    @Override
    public String pay() {
        System.out.println("Paying amount via paypal.");
        return "Payment done by Paypal.";
    }
}
