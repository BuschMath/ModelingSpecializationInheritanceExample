public class Motorcycle extends Vehicle {
    private String engineType;

    public Motorcycle(String make, String model, int year, String engineType) {
        super(make, model, year);
        this.engineType = engineType;
    }

    // Getter and setter for engineType
    String getEngineType() { return engineType; }
}
