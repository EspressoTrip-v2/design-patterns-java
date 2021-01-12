package com.juan;

public class Main {

    public static void main(String[] args) {

	Singleton singleton1 = Singleton.getInstance();
	singleton1.setData(5);
        System.out.println("Singleton 1 data: " + singleton1.getData());
        System.out.println("********");
	Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton 2 data: " + singleton2.getData());
    }
}
