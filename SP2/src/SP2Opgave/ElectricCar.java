package SP2Opgave;

public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange, String registrationNumber, String make, String model, int numberOfDoors) {

        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;


    }

    int getBatteryCapacityKWh() {

        return this.batteryCapacity;
    }

    int getMaxRangeKm() {

        return this.maxRange;
    }

    int getWhPrKm() {

        int wattPrKm = (batteryCapacity * 1000) / maxRange;

        return wattPrKm;
    }

    @Override
    public String getRegistrationNumber() {

        return registrationNumber;
    }

    @Override
    public int getRegistrationFee() {


        double wattHourPrKmToKmPrLitre = getWhPrKm() / 91.25;

        double kmPrLitre = 100 / wattHourPrKmToKmPrLitre;

        int registrationFee = 0;


        if (kmPrLitre <= 5) {
            registrationFee += 10470;

        } else if (kmPrLitre <= 10) {
            registrationFee += 5500;

        } else if (kmPrLitre <= 15) {
            registrationFee += 2340;

        } else if (kmPrLitre <= 20) {
            registrationFee += 1050;

        } else if (kmPrLitre > 20) {
            registrationFee += 330;

        }

        return registrationFee;


    }

    @Override
    public String toString() {

        return "\n" + super.toString() + "\n" + "Battery capacity: " + getBatteryCapacityKWh() + "\n" + "Max range km: " + getMaxRangeKm() + "\n" + "Watt per hour: " + getWhPrKm() + "\n" + "Registration fee: kr. " + getRegistrationFee();


    }
}