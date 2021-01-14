package com.company;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements EmployeeComponent {
    private List<EmployeeComponent> employeeComponentList = new ArrayList<>();

    public void addEmployee(EmployeeComponent employee) {
        employeeComponentList.add(employee);
    }

    public void removeEmployee(EmployeeComponent employee) {
        employeeComponentList.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (EmployeeComponent em : employeeComponentList) {
            em.showEmployeeDetails();
        }
    }
}
