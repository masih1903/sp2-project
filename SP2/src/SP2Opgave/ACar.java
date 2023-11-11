package SP2Opgave;

abstract class ACar implements Car {

    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {

        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;


    }

    public String getRegistrationNumber() {

        return this.registrationNumber;
    }

    public String getMake() {

        return this.make;
    }

    public String getModel() {

        return this.model;
    }

    public int getNumberOfDoors() {

        return this.numberOfDoors;
    }

    @Override
    public String toString() {

        return "Registration number: " + registrationNumber + "\n" + "Make: " + make + "\n" + "Model: " + model + "\n" + "Number Of Doors: " + numberOfDoors;
    }
}