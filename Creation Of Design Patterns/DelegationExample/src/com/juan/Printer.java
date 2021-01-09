package com.juan;

public class Printer {
    // The "Delegator"
    RealPrinter p = new RealPrinter();
    void print(){
        p.print(); // delegation
    }
}
