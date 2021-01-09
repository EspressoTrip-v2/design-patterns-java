public abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }
    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean sHatchBack() {
        return true;
    }
}

class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
    String getEmergencyExitLoc(){
        return "Exit";
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getCubicCapacity();
        vehicle = new Car();
        vehicle.getSpeed();
    }
}