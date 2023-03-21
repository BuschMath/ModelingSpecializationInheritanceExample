public class Car extends Vehicle {
    private int numWheels;

    public Car(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    // Getter and setter for numWheels
    int getNumWheels() { return numWheels; }
}