package com.company;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a concrete component, Closed for modification");
    }
}
