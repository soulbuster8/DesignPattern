package com.example.demo.behavioral.command;

class FileInvoker {

    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        //We can put multiple operations over here like locking and all and then execute the actual command.
        this.command.execute();
    }
}
