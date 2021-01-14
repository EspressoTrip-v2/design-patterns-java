package com.company;

public class Professor implements Faculty {
    private String name;
    private String position;
    private int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String getDetails() {
        return "\t\t\tName: " + getName() +
                "\n\t\t\tPosition: " + getPosition() +
                "\n\t\t\tOffice number: " + getOfficeNumber();
    }
}
