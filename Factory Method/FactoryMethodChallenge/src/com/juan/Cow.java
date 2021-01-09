package com.juan;

public class Cow implements Animal{
    @Override
    public void eat() {
        System.out.println("Cow eats: Scrunch, scrunch");
    }

    @Override
    public void talk() {
        System.out.println("Cow moos: Mooooooo");
    }
}
