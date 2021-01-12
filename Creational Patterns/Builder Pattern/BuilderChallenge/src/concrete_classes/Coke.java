package concrete_classes;

import abstract_classes.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 1.5F;
    }

    @Override
    public String name() {
        return "Coca Cola";
    }
}
