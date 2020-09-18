package com.example.demo.structural.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Assemble assemble = new Assemble();
        Produce produce = new Produce();

        Vehicle vehicle = new Car(produce, assemble);
        vehicle.manufacture();

        produce.work();
        assemble.work();
    }
}

abstract class Vehicle {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    abstract public void manufacture();
}

class Car extends Vehicle {

    public Car(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    @Override
    public void manufacture() {
        System.out.println("Car manufacture.");
        workShop1.work();
        workShop2.work();
    }
}

class Bike extends Vehicle {

    public Bike(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    @Override
    public void manufacture() {
        System.out.println("Bike manufacture.");
    }
}

interface WorkShop {
    public void work();
}

class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("Assembled.");
    }
}

class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}