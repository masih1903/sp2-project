package SP2Opgave;

public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String make, String model, int numberOfDoors) {

        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);

        this.particleFilter = particleFilter;

    }


    @Override
    String getFuelType() {

        return "Diesel";
    }

    @Override
    int getKmPrLitre() {

        return super.getKmPrLitre();
    }

    @Override
    public String getRegistrationNumber() {

        return null;
    }

    @Override
    public int getRegistrationFee() {

        int registrationFee = 0;

        if (particleFilter == false) {
            registrationFee += 1000;
        }


        if (getKmPrLitre() <= 5) {
            registrationFee += 10470 + 15260;

        } else if (getKmPrLitre() <= 10) {
            registrationFee += 5500 + 2770;

        } else if (getKmPrLitre() <= 15) {
            registrationFee += 2340 + 1850;

        } else if (getKmPrLitre() <= 20) {
            registrationFee += 1050 + 1390;

        } else if (getKmPrLitre() > 20) {
            registrationFee += 330 + 130;

        }

        return registrationFee;


    }


    boolean hasParticleFilter() {

        return true;

    }

    public String toString() {

        return super.toString() + "\n" + "Fuel type: " + getFuelType() + "\n" + "Kilometer pr liter: " + getKmPrLitre() + "\n" + "Registration fee: kr. " + getRegistrationFee();
    }

}




