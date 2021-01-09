package com.juan;

interface displayModule {
    void display();
}

class Monitor implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through a monitor");
    }
}

class Projector implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through a projector");
    }
}

public class Computer{
    displayModule dm;

    public void setDisplayModule(displayModule dm){
        this.dm = dm;
    }
    public void display(){
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        displayModule dm1 = new Monitor();
        displayModule dm2 = new Projector();

        cm. setDisplayModule(dm1);
        cm. display();
        cm. setDisplayModule(dm2);
        cm. display();

    }

}

