package com.example.demo.structural.adapter;

public class AdpterPattern {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.makeSound();
        bird.fly();

        ToyDuck duck = new PlaticToyDuck();
        duck.squeak();

        ToyDuck duck1 = new BirdAdapter(bird);
        duck1.squeak();
    }
}

interface Bird {
    public void makeSound();
    public void fly();
}

class Sparrow implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Sparrow sound.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly.");
    }
}

interface ToyDuck {
    public void squeak();
}

class PlaticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Duck squeak");
    }
}

class BirdAdapter implements ToyDuck {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}