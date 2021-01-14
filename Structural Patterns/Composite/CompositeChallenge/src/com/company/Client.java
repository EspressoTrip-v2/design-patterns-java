package com.company;

public class Client {

    public static void main(String[] args) {
        Dean dean = new Dean("Dr S. Sommer", "Technology");
        Chair math = new Chair("Dr Nathan Sims", "Mathematics");
        Chair cse = new Chair("Dr Lucy Hale", "Computer Science");

        Faculty mathProfA = new Professor("Sam Worthington", "Professor", 1001);
        Faculty mathProfB = new Professor("Allison Samuel", "Professor", 1002);
        math.addFaculty(mathProfA);
        math.addFaculty(mathProfB);

        Faculty cseProfA = new Professor("Edward Nokes", "Professor", 1002);
        Faculty cseProfB = new Professor("Jason Moore", "Professor", 1003);
        Faculty cseProfC = new Professor("Cindy Neves", "Professor", 1004);
        cse.addFaculty(cseProfA);
        cse.addFaculty(cseProfB);
        cse.addFaculty(cseProfC);

        dean.addFaculty(math);
        dean.addFaculty(cse);

        System.out.println(dean.getDetails());

        cse.removeFaculty(cseProfB);

        System.out.println(cse.getDetails());
    }
}
