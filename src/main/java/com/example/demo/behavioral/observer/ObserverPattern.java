package com.example.demo.behavioral.observer;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject1 = new Subject("First State");
        Subject subject2 = new Subject("Second State");

        Observer observer1 = new BinaryObserver(subject1);
        Observer observer2 = new HexaObserver(subject1);
        subject1.addObserver(observer1);
        subject1.addObserver(observer2);
        subject1.notifyAllObservers();

        Observer observer3 = new BinaryObserver(subject2);
        Observer observer4 = new BinaryObserver(subject2);
        subject2.addObserver(observer3);
        subject2.addObserver(observer4);
        subject2.notifyAllObservers();
    }
}

