package concrete_classes;

import abstract_classes.Burger;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 30.5F;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
