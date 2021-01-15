package com.company;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Decorator Pattern Demo ***");
        ConcreteComponent cc = new ConcreteComponent();
        cc.doJob();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
        // Decorate cc with Ex_1
        cd_1.setComponent(cc);
        cd_1.doJob();
        // Decorate cc with Ex_2
        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
        cd_2.setComponent(cc);
        cd_2.doJob();

    }
}
