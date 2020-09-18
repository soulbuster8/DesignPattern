package com.example.demo.behavioral.mediator;

abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract public void send(String message);

    abstract public void receive(String message);

}
