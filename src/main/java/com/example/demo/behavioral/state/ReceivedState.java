package com.example.demo.behavioral.state;

class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Package is already delivered.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printState() {
        System.out.println("In received state.");
    }
}
