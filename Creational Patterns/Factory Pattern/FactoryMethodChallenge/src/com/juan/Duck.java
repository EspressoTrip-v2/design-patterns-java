package com.juan;

public class Duck implements Animal{
    @Override
    public void eat() {
        System.out.println("Duck eats: Peck, peck");
    }

    @Override
    public void talk() {
        System.out.println("Duck quacks: Quack, quack");
    }
}
