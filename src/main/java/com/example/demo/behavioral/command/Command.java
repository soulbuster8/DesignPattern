package com.example.demo.behavioral.command;

abstract class Command {
    protected FileSystemReceiver receiver;

    public Command(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    abstract public String execute();
}
