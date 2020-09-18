package com.example.demo.behavioral.mediator;

interface ChatMediator {

    public void sendMessage(String message, User user);

    public void addUser(User user);
}
