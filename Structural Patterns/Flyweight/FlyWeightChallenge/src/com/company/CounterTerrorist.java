package com.company;

public class CounterTerrorist implements Player{
    String weapon;
    String task;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setTask(String task) {
        this.task = task;
    }

    public void mission(){
        System.out.println("Counter terrorist is armed with: " + this.weapon + ". He must complete: " + this.task);
    }
}
