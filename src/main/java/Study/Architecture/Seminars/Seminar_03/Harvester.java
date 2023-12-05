package Study.Architecture.Seminars.Seminar_03;

import java.awt.*;

public class Harvester extends Car {

    public Harvester(String make, String model,FuelType fuelType, Color color) {
        super(make, model,fuelType, color);
        wheelsCount = 6;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public String toString() {
        return "Harvester {" + make + ", " + model + '}';
    }
}
