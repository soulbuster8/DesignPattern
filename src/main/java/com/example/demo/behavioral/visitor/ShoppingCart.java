package com.example.demo.behavioral.visitor;

public interface ShoppingCart {
    int visit(Book book);
    int visit(Fruit fruit);
}
