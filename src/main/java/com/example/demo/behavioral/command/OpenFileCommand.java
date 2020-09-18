package com.example.demo.behavioral.command;

class OpenFileCommand extends Command {

    public OpenFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public String execute() {
        return this.receiver.openFile();
    }
}
