package com.company;

public class ManagerLeaf implements EmployeeComponent{
    private String name;
    private long empId;
    private String position;

    public ManagerLeaf(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("ID: " + empId + " Name: " + name + " Position: " + position);
    }
}
