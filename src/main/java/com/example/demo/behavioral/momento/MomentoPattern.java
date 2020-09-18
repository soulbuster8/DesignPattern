package com.example.demo.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

public class MomentoPattern {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State#1");
        careTaker.add(originator.saveStateToMomento());
        originator.setState("State#2");
        careTaker.add(originator.saveStateToMomento());
        originator.setState("State#3");
        careTaker.add(originator.saveStateToMomento());
        originator.getStateFromMomento(careTaker.getMomento(1));
        System.out.println(originator.getState());
    }
}

