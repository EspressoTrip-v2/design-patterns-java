package com.juan;

public class Main {

    public static void main(String[] args) {
	Duck duck = new MallardDuck();
	Turkey turkey = new WildTurkey();

	// Adapter
	Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe adapted turkey says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
