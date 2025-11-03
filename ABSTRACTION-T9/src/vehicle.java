abstract class Vehicle {

    protected String brnad;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String brand, String model, int year, double basePrice) {
        this.brnad = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }
    public abstract void displayVehicleInfo();
}
