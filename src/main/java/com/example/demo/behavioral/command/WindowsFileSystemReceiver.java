package com.example.demo.behavioral.command;

class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public String openFile() {
        return "File open in Windows system.";
    }

    @Override
    public String writeFile() {
        return "File write in Windows system.";
    }

    @Override
    public String closeFile() {
        return "File close in Windows system.";
    }
}
