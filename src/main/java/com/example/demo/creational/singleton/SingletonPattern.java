package com.example.demo.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        Database obj1 = Database.getInstance();
        Database obj2 = Database.getInstance();

        System.out.println(obj1 == obj2);
    }
}

class Database {
    private static Database database;

    private Database() {
    }

    public static Database getInstance()
    {
        if(database == null)
        {
            synchronized (Database.class)
            {
                if(database == null)
                    database = new Database();
            }
        }
        return database;
    }
}
