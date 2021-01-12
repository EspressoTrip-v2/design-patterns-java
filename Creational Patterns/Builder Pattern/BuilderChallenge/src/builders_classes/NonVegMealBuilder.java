package builders_classes;

import concrete_classes.ChickenBurger;
import concrete_classes.Pepsi;

public class NonVegMealBuilder implements MealBuilderInterface{
    private Meal nonVegMeal = new Meal();
    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
