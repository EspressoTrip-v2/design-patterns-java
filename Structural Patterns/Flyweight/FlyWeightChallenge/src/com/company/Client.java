package com.company;

public class Client {

    public static void main(String[] args) {
	PlayerFactory factory = new PlayerFactory();

        for (int i = 0; i < 5; i++) {
           CounterTerrorist newPlayer =
                   (CounterTerrorist) factory.getPlayer("counter terrorist");
           newPlayer.setTask("Capture the flag");
           newPlayer.assignWeapon("Machinegun");
           newPlayer.mission();
        }
        factory.getSize();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            Terrorist newPlayer = (Terrorist) factory.getPlayer("terrorist");
            newPlayer.setTask("Protect the flag");
            newPlayer.assignWeapon("Shot gun");
            newPlayer.mission();
        }
        factory.getSize();
    }
}
