package com.example.demo.behavioral.command;

class WriteFileCommand extends Command {

    public WriteFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public String execute() {
        return this.receiver.writeFile();
    }
}
