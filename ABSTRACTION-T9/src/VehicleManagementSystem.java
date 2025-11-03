public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("  Welcome to the Vehicle Management System!");
        System.out.println("__________________________________________________");

        Car car = new Car("LEXUS", "LX", 2025, 106, 4, "Diesel");
        Motorcycle motorcycle = new Motorcycle("DUCATI", "175-T", 1958, 9700, 174, true);
        Truck truck = new Truck("MERCEDES BENZ", "E-ACTROS", 2025, 250000, 25, 3);

        Vehicle[] vehicles = {car, motorcycle, truck};

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleInfo();
            double rentalCost = vehicle.computeRentalCost(rentalDays);
            System.out.printf("Rental Cost for %d days: $%.2f%n", rentalDays, rentalCost);
            System.out.println("--------------------------------------------------");

        }
        int[] variousdays = {1, 2, 15, 30};
        System.out.println("\nRental costs for Car for various days:");
        for (int days : variousdays) {
            System.out.println(days + " day(s): $" + String.format("%.2f", car.computeRentalCost(days)));


        }
        System.out.println("\nRental costs for Motorcycle for various days:");
        for (int days : variousdays) {
            System.out.println(days + " day(s): $" + String.format("%.2f", motorcycle.computeRentalCost(days)));
        }
        System.out.println("\nRental costs for Truck for various days:");
        for (int days : variousdays) {
            System.out.println(days + " day(s): $" + String.format("%.2f", truck.computeRentalCost(days)));
        }


        System.out.println("\nThank you for using our Vehicle Management System!");
        System.out.println("===================================================");

    }
}
