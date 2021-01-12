package abstract_classes;

import concrete_classes.Bottle;
import concrete_classes.Wrapper;
import interfaces.Item;
import interfaces.Packing;


public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
