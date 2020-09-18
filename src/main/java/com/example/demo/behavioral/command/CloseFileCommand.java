package com.example.demo.behavioral.command;

class CloseFileCommand extends Command {

    public CloseFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public String execute() {
        return this.receiver.closeFile();
    }
}
