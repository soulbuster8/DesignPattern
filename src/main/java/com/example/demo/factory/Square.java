package com.example.demo.factory;

public class Square implements Shape {
    public Shape draw() {
        return new Square();
    }
}
