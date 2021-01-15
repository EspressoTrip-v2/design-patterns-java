package com.company;

public class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();
        // Additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}
