package com.company;

public class Dollar20Dispencer implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(com.company.Currency cur) {
        if (cur.getAmount() > 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " $20 notes.");
            if (remainder >= 10) {
                this.chain.dispense(new Currency(remainder));
            }
        }else {
            this.chain.dispense(cur);
        }
    }
}
