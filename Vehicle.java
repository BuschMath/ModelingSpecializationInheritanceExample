public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and setters for make, model, and year
    String getMake() { return make; }
    String getModel() { return model; }
}