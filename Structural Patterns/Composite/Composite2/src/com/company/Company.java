package com.company;

public class Company {

    public static void main(String[] args) {
        EmployeeComponent dev1 = new DeveloperLeaf("Juan Botha", 1258, "Pro Developer");
        EmployeeComponent dev2 = new DeveloperLeaf("Jason Mann", 1236, "Junior Developer");
        EmployeeComponent dev3 = new DeveloperLeaf("Edward Samson", 1445, "Junior Developer");

        ManagerComposite engManager = new ManagerComposite("Mike Brower", 50000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);
        engManager.addEmployee(dev3);

        EmployeeComponent dev4 = new DeveloperLeaf("Tomas Jones", 1478, "Developer");
        ManagerComposite generalManager = new ManagerComposite("Mark Scisson", 10000);
        generalManager.addEmployee(dev4);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
        
    }
}
