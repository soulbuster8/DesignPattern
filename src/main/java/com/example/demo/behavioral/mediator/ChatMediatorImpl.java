package com.example.demo.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User senderUser) {
        for (User user : this.users) {
            if (!user.equals(senderUser)) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
