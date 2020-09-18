package com.example.demo.behavioral.template;

public class Football implements Game {
    @Override
    public String initialize() {
        return "Initializing the football game.";
    }

    @Override
    public String start() {
        return "Starting the football game.";
    }

    @Override
    public String end() {
        return "Ending the football game.";
    }
}
