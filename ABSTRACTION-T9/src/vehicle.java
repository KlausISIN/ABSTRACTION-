abstract class Vehicle {

    protected String brand;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }
    public abstract void displayVehicleInfo();

    public double computeRentalCost(int days) {
        double dailyRate = basePrice * 0.05;
        return dailyRate * days;
    }
}

