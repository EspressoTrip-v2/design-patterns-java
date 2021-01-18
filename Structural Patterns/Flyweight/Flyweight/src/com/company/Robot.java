package com.company;

public class Robot implements RobotInterface {
    String robotType;
    String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " tupe robot, with a color of " + colorOfRobot + " color");
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}
