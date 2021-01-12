package com.juan;

import builders_classes.MealBuilderInterface;

public class Director {
    MealBuilderInterface myBuilder;
    public void construct(MealBuilderInterface builder){
        myBuilder = builder;
        builder.buildBurger();
        builder.buildDrink();
    }
}
