package com.example.demo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightPattern {

    public static void main(String[] args) {
        GameObject object1 = Facory.createObject("Terrorist");
        GameObject object2 = Facory.createObject("Cops");
        GameObject object3 = Facory.createObject("Terrorist");
        try {
            GameObject object4 = Facory.createObject("Random");
        }
        catch (Exception e) {
            System.out.println("Helllo");
            e.printStackTrace();
        }

        object1.mission();
        object2.mission();
        object3.mission();
    }
}

class Facory {

    private static Map<String, GameObject> gameObjects = new HashMap<>();

    public static GameObject createObject(String objectType) {

        GameObject gameObject = gameObjects.get(objectType);
        if(gameObject != null)
            return gameObject;

        switch(objectType) {
            case "Terrorist":
                gameObject = new Terrorist();
                break;
            case "Cops":
                gameObject = new Cops();
                break;
            default:
                throw new IllegalStateException("Unsupported operaion");
        }

        gameObjects.put(objectType, gameObject);
        return gameObject;
    }
}

interface GameObject {
    public void mission();
}

class Terrorist implements GameObject{
    private final String color;
    private int pos;

    public Terrorist() {
        System.out.println("Terrorist has been created.");
        this.color = "Red";
    }

    @Override
    public void mission() {
        System.out.println("Attack.");
    }
}

class Cops implements GameObject {
    private final String color;
    private int pos;

    public Cops() {
        System.out.println("Cops has been created.");
        this.color = "Black";
    }

    @Override
    public void mission() {
        System.out.println("Defence.");
    }
}
