package com.example.demo.behavioral.state;

class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("No previous state for this");
    }

    @Override
    public void printState() {
        System.out.println("In Ordered state.");
    }
}
