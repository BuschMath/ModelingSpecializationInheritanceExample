public class Main {
    static public void main(String args[]){
        // Create a Car object
        Car myCar = new Car("Honda", "Civic", 2021, 4);
        System.out.println("My car is a " + myCar.getMake() + " " + myCar.getModel() + " with " + myCar.getNumWheels() + " wheels.");

        // Create a Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, "V-Twin");
        System.out.println("My motorcycle is a " + myMotorcycle.getMake() + " " + myMotorcycle.getModel() + " with a " + myMotorcycle.getEngineType() + " engine.");

    }
}
