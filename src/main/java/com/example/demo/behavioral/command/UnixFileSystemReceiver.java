package com.example.demo.behavioral.command;

class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public String openFile() {
        return "File open in Unix system.";
    }

    @Override
    public String writeFile() {
        return"File write in Unix system.";
    }

    @Override
    public String closeFile() {
        return"File close in Unix system.";
    }
}
