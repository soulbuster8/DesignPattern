package com.example.demo.factory;

public class Circle implements Shape {

    @Override
    public Shape draw() {
        return new Circle();
    }
}