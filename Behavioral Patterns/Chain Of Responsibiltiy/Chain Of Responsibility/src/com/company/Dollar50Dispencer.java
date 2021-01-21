package com.company;

public class Dollar50Dispencer implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(com.company.Currency cur) {
        if (cur.getAmount() > 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + " $50 notes.");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }else {
            this.chain.dispense(cur);
        }
    }
}
