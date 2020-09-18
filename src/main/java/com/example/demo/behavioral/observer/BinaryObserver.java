package com.example.demo.behavioral.observer;

class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName());
        System.out.println("Observer state : " + this.subject.getState());
    }
}
