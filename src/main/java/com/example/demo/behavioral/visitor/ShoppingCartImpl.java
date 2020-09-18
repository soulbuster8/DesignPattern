package com.example.demo.behavioral.visitor;

public class ShoppingCartImpl implements ShoppingCart{

    public ShoppingCartImpl() {
    }

    @Override
    public int visit(Book book) {
        return 2;
    }

    @Override
    public int visit(Fruit fruit) {
        return 5;
    }
}
