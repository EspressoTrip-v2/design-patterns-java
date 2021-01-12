package com.juan;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\nProduct completed as below");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("Part " + (i + 1) + ": " + parts.get(i));
        }
    }

}
