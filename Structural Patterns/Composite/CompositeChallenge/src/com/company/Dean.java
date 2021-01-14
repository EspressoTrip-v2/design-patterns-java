package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dean implements Faculty {
    private List<Faculty> facultyList = new ArrayList<>();
    private String name;
    private String departmentName;

    public Dean(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    private String getName() {
        return name;
    }

    private String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------\n");
        sb.append("\t\t\tDean\n");
        sb.append("-----------------------------\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Dean of: ").append(getDepartmentName()).append("\n");
        sb.append("-----------------------------\n");
        for (Faculty person : facultyList) {
            sb.append(person.getDetails()).append("\n");
        }
        return sb.toString();
    }


    public void addFaculty(Faculty person) {
        facultyList.add(person);
    }

    public void removeFaculty(Faculty person) {
        facultyList.remove(person);
    }
}
