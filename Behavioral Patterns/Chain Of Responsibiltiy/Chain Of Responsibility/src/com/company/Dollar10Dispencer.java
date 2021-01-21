package com.company;

public class Dollar10Dispencer implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() != 0) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " $10 notes.");

        } else {
            System.out.println("Can only dispense multiples of $10s");
        }
    }

}
