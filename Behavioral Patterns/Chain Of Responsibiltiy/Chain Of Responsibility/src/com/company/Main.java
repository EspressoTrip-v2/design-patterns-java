package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client atmDispensor = new Client();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter amount to dispense:\r");
            int amount = 0;
            amount = scanner.nextInt();
            scanner.nextLine();
            if (amount % 10 != 0) {
                System.out.println("Can only dispense multiples of $10s");
                continue;
            }
            atmDispensor.c1.dispense(new Currency(amount));
        }
    }
}
