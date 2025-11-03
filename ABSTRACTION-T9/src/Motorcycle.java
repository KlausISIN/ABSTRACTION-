 class Motorcycle extends Vehicle {

    private int engineCC;
    private boolean hasHelmet;

    public Motorcycle(String brand, String model, int year, double basePrice, int engineCC,boolean hasHelmet) {
        super(brand, model, year, basePrice);
        this.engineCC = engineCC;
        this.hasHelmet = hasHelmet;
    }
    @Override
    public void displayVehicleInfo() {
        System.out.println("\n___Motorcycle Information___");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Includes Helmet: " + (hasHelmet ? "Yes" : "No"));
    }
}
