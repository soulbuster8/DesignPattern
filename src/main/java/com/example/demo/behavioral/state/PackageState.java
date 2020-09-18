package com.example.demo.behavioral.state;

interface PackageState {
    public void next(Package pkg);

    public void prev(Package pkg);

    public void printState();
}
