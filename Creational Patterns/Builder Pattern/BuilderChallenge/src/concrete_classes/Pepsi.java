package concrete_classes;

import abstract_classes.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 1.25F;
    }

    @Override
    public String name() {
        return "Pepsi Cola";
    }
}
