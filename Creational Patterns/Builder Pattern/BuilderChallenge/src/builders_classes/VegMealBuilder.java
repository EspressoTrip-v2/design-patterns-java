package builders_classes;

import concrete_classes.Coke;
import concrete_classes.VegBurger;

public class VegMealBuilder implements MealBuilderInterface{
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());

    }
    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
