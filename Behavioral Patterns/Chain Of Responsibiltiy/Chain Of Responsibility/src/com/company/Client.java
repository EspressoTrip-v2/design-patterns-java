package com.company;

public class Client {
    public DispenseChain c1;

    public Client() {
        this.c1 = new Dollar50Dispencer();
        DispenseChain c2 = new Dollar20Dispencer();
        DispenseChain c3 = new Dollar10Dispencer();

        this.c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
}
