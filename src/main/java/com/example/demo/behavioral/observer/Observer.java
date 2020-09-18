package com.example.demo.behavioral.observer;

abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    abstract public void update();
}
