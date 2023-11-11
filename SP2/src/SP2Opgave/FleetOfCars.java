package SP2Opgave;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<Car>();

    public void addCar(Car car) {

        fleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet() {

        int total = 0;

        for (Car c : fleet) {
            total += c.getRegistrationFee();

        }

        return total;
    }

    @Override
    public String toString() {

        String cars = "";
        for (Car c : fleet) {
            cars += c + "\n \n";
        }

        return cars + "Total registration fee of all cars: " + getTotalRegistrationFeeForFleet();
    }
}