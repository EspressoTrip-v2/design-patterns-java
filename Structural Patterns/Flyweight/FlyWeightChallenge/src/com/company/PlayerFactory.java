package com.company;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private HashMap<String, Player> hm = new HashMap<>();

    public Player getPlayer(String type) {
        Player player = null;
        if (hm.containsKey(type)) {
            player = hm.get(type);
            return player;
        } else {
            switch (type) {
                case "terrorist":
                    player = new Terrorist();
                    hm.put(type, player);
                    System.out.println("New terrorist added");
                    break;
                case "counter terrorist":
                    player = new CounterTerrorist();
                    hm.put(type, player);
                    System.out.println("New counter terrorist added");
                    break;
                default:
                    System.out.println("Can only create 'terrorists' or 'counter terrorists'\n");
            }
        }
        return player;
    }

    public void getSize() {
        System.out.println("Total number of players created: " + hm.size());
    }

    public void print() {
        for (Map.Entry<String, Player> p : hm.entrySet()) {
            System.out.println(p.getValue().toString());
        }
    }
}
