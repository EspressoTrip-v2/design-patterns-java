package com.juan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Get captain for our team");
        Captain c1 = Captain.getCaptain();
        System.out.println("New captain selected");
        System.out.println("Try getting another captain for our team");
        Captain c2 = Captain.getCaptain();
        if(c1 == c2){
            System.out.println("You already selected a captain, send him for the toss");
            System.out.println("c1 and c2 are the same instance");
        }



    }
}
