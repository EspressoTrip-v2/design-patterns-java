package concrete_classes;

import abstract_classes.Burger;

public  class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.50F;
    }
}
