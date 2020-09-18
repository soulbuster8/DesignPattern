package com.example.demo.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy{

    @Override
    public String pay() {
        System.out.println("Paying amount via credit card.");
        return "Payment done by credit card.";
    }
}
