package Study.Architecture.Seminars.Seminar_03;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {


    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();
        CarWash carWash = new CarWash();

        ArrayList<Car> carArrayList = new ArrayList<>();
        SportCar sportCar1 = SportCar.create("Audi", "R8",FuelType.Diesel, Color.BLACK, 3);
        SportCar sportCar2 = SportCar.create("Bugatti", "Veyron",FuelType.Gasoline, Color.BLACK, 3);
        Harvester harvester1 = new Harvester("ISAL", "6000",FuelType.Diesel, Color.BLACK);
        Harvester harvester2 = new Harvester("Nilfisk City Ranger", "3500",FuelType.Diesel, Color.BLACK);
        carArrayList.add(sportCar1);
        carArrayList.add(sportCar2);
        carArrayList.add(harvester1);
        carArrayList.add(harvester2);

        for (Car car: carArrayList) {
            System.out.println(car + " заехал на сервисную станцию");
            car.service(serviceStation);
            System.out.println();
        }

        for (Car car: carArrayList) {
            System.out.println(car + " заехал на мойку");
            car.setWashing(carWash);
            car.wash();
            System.out.println();
        }
    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500 * 6;
        }
        else {
            return 1000 * 4;
        }
    }

}
