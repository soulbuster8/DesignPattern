package com.example.demo.structural.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connect("ServerHost");
    }
}

interface Internet {
    public void connect(String serverHost);
}

class RealInternet implements Internet {
    public RealInternet() {
    }

    @Override
    public void connect(String serverHost) {
        System.out.println("Connected to Real Internet.");
    }
}

class ProxyInternet implements Internet {

    private Internet internet;

    @Override
    public void connect(String serverHost) {
        if(internet == null)
            internet = new RealInternet();
        System.out.println("Coming in Proxy methods.");
        internet.connect("ServerHost");
    }
}