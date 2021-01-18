package com.company;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotCategory(String type) throws Exception {
        RobotInterface robotCat = null;
        if (shapes.containsKey(type)) {
            robotCat = shapes.get(type);
        } else {
            switch (type) {
                case "king":
                    robotCat = new Robot(type);
                    shapes.put("king", robotCat);
                    System.out.println("King robot created");
                    break;
                case "queen":
                    robotCat = new Robot(type);
                    shapes.put("queen", robotCat);
                    System.out.println("Queen robot created");
                    break;
                default:
                    throw new Exception("Robot factory can only create king or queen robots");
            }
        }
        return robotCat;
    }
}
