public class Car extends Vehicle {

    private int numberOfDoors;
    private String feultype;

    public Car(String brand, String model, int year, double basePrice, int numberOfDoors, String feultype) {
        super(brand, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.feultype = feultype;
    }
    @Override
    public void displayVehicleInfo() {
        System.out.println("\n___Car Information___");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + feultype);
    }
    @Override
    public double computeRentalCost(int days) {
        return super.computeRentalCost(days) * 1.1;
    }
}

