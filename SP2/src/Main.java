import SP2Opgave.DieselCar;
import SP2Opgave.ElectricCar;
import SP2Opgave.FleetOfCars;
import SP2Opgave.GasolineCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        ElectricCar c = new ElectricCar(70, 200, "AA33333", "Tesla", "Sport", 5);


        DieselCar d = new DieselCar(20, true, "BB44444", "Opel", "Corsa", 3);


        GasolineCar g = new GasolineCar(18, "CC5555", "Toyota", "Yaris", 5);


        fleet.addCar(c);
        fleet.addCar(d);
        fleet.addCar(g);

        System.out.println(fleet);


    }
}