class Truck extends Vehicle {

    private double loadCapacity;
    private int numberOfAxles;

    public Truck(String brand, String model, int year, double basePrice, double loadCapacity, int numberOfAxles) {
        super(brand, model, year, basePrice);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("\n___Truck Information___");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Number of Axles: " + numberOfAxles);
    }

    @Override
    public double computeRentalCost(int days) {

        return super.computeRentalCost(days) * 1.2 + (loadCapacity * 1.2 * days);
    }


}
