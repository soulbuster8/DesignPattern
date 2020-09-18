package com.example.demo.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorPatternlTest {

    @Test
    public void getBookAmount() {
        ShoppingCart cart = new ShoppingCartImpl();
        ItemElement item = new Book("2 States", 195);
        assertEquals(item.amount(cart), 2);
    }

    @Test
    public void getFruitAmount() {
        ShoppingCart cart = new ShoppingCartImpl();
        ItemElement item = new Fruit("Mango", 25);
        assertEquals(item.amount(cart), 5);
    }

}