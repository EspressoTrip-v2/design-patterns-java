package builders_classes;

import interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(){
        float cost = 0;
        for(Item i: items){
           cost += i.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item i: items){
            System.out.println("Item: " + i.name());
            System.out.println("Packing: " + i.packing().pack());
            System.out.println("Price: " + i.price());
        }
        System.out.println("---------");
    }

}
