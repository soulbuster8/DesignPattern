package com.example.demo.abstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.createFactory("Modern");
        factory.getChair().purpose();
        factory = FactoryProducer.createFactory("Victoria");
        factory.getSofa().purpose();
    }
}

class FactoryProducer {
    public static AbstractFactory createFactory(String factoryType)
    {
        if(factoryType.equals("Victoria"))
        {
            return new VictorianFactory();
        }
        if(factoryType.equals("Modern"))
        {
            return new ModernFactory();
        }
        return null;
    }
}

abstract class AbstractFactory {

    abstract Chair getChair();
    abstract Sofa getSofa();
    abstract CoffeeTable getCoffee();
}

class VictorianFactory extends AbstractFactory {
    @Override
    Chair getChair() {
        return new ChairVictoria();
    }

    @Override
    Sofa getSofa() {
        return new SofaVictoria();
    }

    @Override
    CoffeeTable getCoffee() {
        return new CoffeeTableVicoria();
    }
}

class ModernFactory extends AbstractFactory {
    @Override
    Chair getChair() {
        return new ChairModern();
    }

    @Override
    Sofa getSofa() {
        return new SofaModern();
    }

    @Override
    CoffeeTable getCoffee() {
        return new CoffeeTableModern();
    }
}

interface CoffeeTable {
    void purpose();
}

class CoffeeTableVicoria implements CoffeeTable{
    private String type;

    public CoffeeTableVicoria() {
        this.type = "Victorian";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Coffee table.");
    }
}

class CoffeeTableModern implements CoffeeTable {
    private String type;

    public CoffeeTableModern() {
        this.type = "Modern";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Coffee table.");
    }
}

interface Sofa {
    void purpose();
}

class SofaVictoria implements Sofa {
    private String type;

    public SofaVictoria() {
        this.type = "Victoria";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Sofa.");
    }
}

class SofaModern implements Sofa {
    private String type;

    public SofaModern() {
        this.type = "Modern";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Sofa.");
    }
}

interface Chair {
    void purpose();
}

class ChairVictoria implements Chair {
    private String type;

    public ChairVictoria() {
        this.type = "Victoria";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Chair.");
    }
}

class ChairModern implements Chair {
    private String type;

    public ChairModern() {
        this.type = "Modern";
    }

    @Override
    public void purpose() {
        System.out.println(this.type + " Model for Chair.");
    }
}
