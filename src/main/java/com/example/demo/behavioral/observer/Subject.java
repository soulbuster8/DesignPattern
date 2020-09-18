package com.example.demo.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public Subject(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObservers() {
        System.out.println("Notifying all observers ----->");
        for (Observer observer : observers) {
            System.out.println(observer.subject.state);
        }
    }
}
