package com.example.demo.behavioral.command;

public class CommandPattern {
    public static void main(String[] args) {
        FileSystemReceiver receiver = FileSystemUtility.getFileSystemReceiver();
        Command command = new OpenFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(command);
        invoker.execute();

        command = new CloseFileCommand(receiver);
        invoker = new FileInvoker(command);
        invoker.execute();
    }
}



