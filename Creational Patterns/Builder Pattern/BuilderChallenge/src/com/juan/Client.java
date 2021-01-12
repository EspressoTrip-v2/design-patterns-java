package com.juan;

import builders_classes.Meal;
import builders_classes.MealBuilderInterface;
import builders_classes.NonVegMealBuilder;
import builders_classes.VegMealBuilder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        // Builders
        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();
        // Build meals
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("\n*** Veg Meal ***");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        System.out.println("\n*** non-Veg Meal ***");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());



    }
}
