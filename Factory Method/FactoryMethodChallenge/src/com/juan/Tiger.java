package com.juan;

public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eats: Chomp, chomp...");
    }

    @Override
    public void talk() {
        System.out.println("Tiger roars: Rrrrrrrrrrrr!");
    }
}
