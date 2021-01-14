package com.company;

import java.util.ArrayList;
import java.util.List;

public class ManagerComposite implements EmployeeComponent {
    private List<EmployeeComponent> employeeComponentList = new ArrayList<>();
    private String name;
    private double salary;

    public ManagerComposite(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void addEmployee(EmployeeComponent employee) {
        employeeComponentList.add(employee);
    }

    public void removeEmployee(EmployeeComponent employee) {
        employeeComponentList.remove(employee);
    }

    public EmployeeComponent getChild(int i) {
        return employeeComponentList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("----------------");
        System.out.println("Manager name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("----------------");
        for (EmployeeComponent emp : employeeComponentList) {
            emp.showEmployeeDetails();
        }
    }
}
