package com.example.demo.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

class CareTaker {

    private List<Momento> momentoList = new ArrayList<>();

    public void add(Momento momento) {
        this.momentoList.add(momento);
    }

    public Momento getMomento(int index) {
        return this.momentoList.get(index);
    }

}
