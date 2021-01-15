package com.company;

public class ConcreteDecoratorEx_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println();
        System.out.println("*** Start Ex_2 ***");
        super.doJob();
        System.out.println("Explicitly from EX_2");
        System.out.println("*** END EX_@ ***");
    }
}
