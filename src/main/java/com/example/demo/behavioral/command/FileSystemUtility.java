package com.example.demo.behavioral.command;

class FileSystemUtility {

    public static FileSystemReceiver getFileSystemReceiver() {
        String os = System.getProperty("os.name");
        System.out.println("OS name is : " + os);
        if (os.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else
            return new UnixFileSystemReceiver();
    }
}
