package com.example.demo.factory;

public class ShapeFactory {
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