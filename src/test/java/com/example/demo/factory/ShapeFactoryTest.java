package com.example.demo.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class ShapeFactoryTest {
    @Test
    public void testFactoryPattern() {
        Shape shape = ShapeFactory.createShape("Circle");
        Shape s = shape.draw();
        assertEquals(s.getClass(), Circle.class);
    }
}