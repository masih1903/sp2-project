package SP2Opgave;

abstract class AFuelCar extends ACar {

    private int kmPrLitre;


    public AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);

        this.kmPrLitre = kmPrLitre;

    }

    abstract String getFuelType();


    int getKmPrLitre() {

        return this.kmPrLitre;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}