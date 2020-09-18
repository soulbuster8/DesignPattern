package com.example.demo.structural.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        ShapeDecorator decorator = new CircleDecorator(new RectangleDecorator(rectangle));
        decorator.draw();
    }
}

interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}

abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }
}

class CircleDecorator extends ShapeDecorator {
    public CircleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Circle is drawn from decorator.");
    }
}

class RectangleDecorator extends ShapeDecorator {
    public RectangleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Rectangle is drawn from decorator.");
    }
}