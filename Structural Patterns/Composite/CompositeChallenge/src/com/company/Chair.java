package com.company;

import java.util.ArrayList;
import java.util.List;

public class Chair implements Faculty {

    private List<Faculty> facultyList = new ArrayList<>();

    private String name;
    private String departmentName;

    public Chair(String name, String departmentName) {
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
        sb.append("Name: " + getName());
        sb.append("\nDepartment: " + getDepartmentName());
        sb.append("\nFaculty Members:\n");
        for (Faculty person : facultyList) {
            sb.append(person.getDetails() + "\n");
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
