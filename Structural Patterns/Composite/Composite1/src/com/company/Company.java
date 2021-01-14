package com.company;

public class Company {

    public static void main(String[] args) {
        EmployeeComponent dev1 = new DeveloperLeaf("Juan Botha", 1258, "Pro Developer");
        EmployeeComponent dev2 = new DeveloperLeaf("Jason Mann", 1236, "Junior Developer");
        EmployeeComponent dev3 = new DeveloperLeaf("Edward Samson", 1445, "Junior Developer");

        DirectoryComposite engineer = new DirectoryComposite();
        engineer.addEmployee(dev1);
        engineer.addEmployee(dev2);
        engineer.addEmployee(dev3);

        EmployeeComponent man1 = new ManagerLeaf("Gene Ritchie", 2589, "SEO manager");
        EmployeeComponent man2 = new ManagerLeaf("Ramond Ritchie", 2589, "Jason's manager");

        DirectoryComposite accDirectory = new DirectoryComposite();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        DirectoryComposite companyDirectory = new DirectoryComposite();
        companyDirectory.addEmployee(engineer);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
