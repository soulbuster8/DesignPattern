package com.example.demo.factory;

public class EmptyShape implements Shape {
    @Override
    public Shape draw() {
        return new EmptyShape();
    }
}