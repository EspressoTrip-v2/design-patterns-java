package com.company;

public class Client {

    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("*** FlyWeight Pattern ***");
        // Create small Robots
        Robot shape;

        for (int i = 0; i < 2; i++) {
            shape = (Robot) myFactory.getRobotCategory("king");
            shape.setColor("red");
            shape.print();
        }
        // Get the number of robots created so far
        int numOfRobots = myFactory.totalObjCreated();
        System.out.println("Total number of objects created: " + numOfRobots);

        // Create large robots
        for (int i = 0; i < 5; i++) {
            shape = (Robot) myFactory.getRobotCategory("queen");
            shape.setColor("green");
            shape.print();
        }

        // Get the number of robots created so far
        numOfRobots = myFactory.totalObjCreated();
        System.out.println("Total number of objects created: " + numOfRobots);

    }
}
