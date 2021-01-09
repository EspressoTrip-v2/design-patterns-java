package com.juan;

public class Singleton {
    // Creates the instance on loading of class
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public Singleton getInstance() {
        return instance;
    }

}
