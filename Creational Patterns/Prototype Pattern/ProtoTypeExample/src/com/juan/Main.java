package com.juan;

public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println(clonedCircle.getId());
        Shape clonedSquare = ShapeCache.getShape("2");
        System.out.println(clonedSquare.getId());
        Shape clonedRectangle = ShapeCache.getShape("3");
        System.out.println(clonedRectangle.getId());

    }
}
