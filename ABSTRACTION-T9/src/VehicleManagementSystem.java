public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("  Welcome to the Vehicle Management System!");
        System.out.println("__________________________________________________");

        Car car = new Car("LEXUS", "LX", 2025, 106, 4, "Diesel");
        Motorcycle motorcycle = new Motorcycle("DUCATI", "175-T", 1958, 9700, 174, true);
        Truck truck = new Truck("MERCEDES BENZ", "E-ACTROS", 2025, 250000, 25, 3);


    }

}

