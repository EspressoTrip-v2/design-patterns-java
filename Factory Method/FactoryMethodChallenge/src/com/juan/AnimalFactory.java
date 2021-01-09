package com.juan;

public class AnimalFactory {
    public static Animal getAnimal(String animal) {
        switch (animal.toLowerCase()) {
            case "cow":
                return new Cow();
            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                return null;
        }
    }
}
