package com.example.demo.behavioral.template;

public class Cricket implements Game {

    @Override
    public String initialize() {
        return "Initializing the cricket game.";
    }

    @Override
    public String start() {
        return "Starting the cricket game.";
    }

    @Override
    public String end() {
        return "Ending the cricket game.";
    }
}
