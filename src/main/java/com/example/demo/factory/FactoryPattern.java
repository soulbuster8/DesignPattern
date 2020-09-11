package com.example.demo.factory;

public class FactoryPattern {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("Circle");
        shape.draw();
    }

}

class ShapeFactory {
    public static Shape createShape(String shapeType)
    {
        if(shapeType.equals("Circle"))
        {
            return new Circle();
        }
        if(shapeType.equals("Square"))
        {
            return new Square();
        }
        return new EmptyShape();
    }
}

interface Shape {
    void draw();

}

class Circle implements Shape {
    @Override
    public void draw() {

    }
}

class Square implements Shape {
    @Override
    public void draw() {

    }
}

class EmptyShape implements Shape {
    @Override
    public void draw() {

    }
}



