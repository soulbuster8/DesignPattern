package com.example.demo.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Aman");
        User user2 = new UserImpl(mediator, "XXX");
        User user3 = new UserImpl(mediator, "YYY");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello from Aman !");
    }
}

