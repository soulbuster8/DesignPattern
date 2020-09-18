package com.example.demo.structural.facade;

public class FacadePattern {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        ShopKeeper shopKeeper = new ShopKeeper(iPhone);
        shopKeeper.mobileDetails();
    }
}

interface MobileShop {
    public void mobileNo();
    public void price();
    public void uniqueId();
}

class IPhone implements MobileShop {

    @Override
    public void mobileNo() {
        System.out.println("IPhone 6.");
    }

    @Override
    public void price() {
        System.out.println("Rs 60000.");
    }

    @Override
    public void uniqueId() {
        System.out.println("IPhone unique id.");
    }
}

class Samsung implements MobileShop {
    @Override
    public void mobileNo() {
        System.out.println("Samsung.");
    }

    @Override
    public void price() {
        System.out.println("Rs 50000.");
    }

    @Override
    public void uniqueId() {
        System.out.println("Samsung unique id.");
    }
}

class ShopKeeper {
    private MobileShop mobileShop;

    public ShopKeeper(MobileShop mobileShop) {
        this.mobileShop = mobileShop;
    }

    public void mobileDetails() {
        mobileShop.uniqueId();
        mobileShop.mobileNo();
        mobileShop.price();
    }
}