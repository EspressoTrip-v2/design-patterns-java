package com.juan;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData(55);
        System.out.println("Singleton 1 Data: " + singleton1.getData() + " Reference: " + singleton1);
        System.out.println();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton 1 Data: " + singleton2.getData() + " Reference: " + singleton2);
    }
}
