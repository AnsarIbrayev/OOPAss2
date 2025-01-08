import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Creating vehicle instances
        Car car1 = new Car("Car", "Toyota", 25000.0, true, 4);
        Car car2 = new Car("Car", "Honda", 22500.0, true, 4);
        Truck truck1 = new Truck("Truck", "Volvo", 50000.0, true, 10000);

        //Creating customer instance
        Customer customer = new Customer("John Doe", 30, "ABC12345");

        //Creating rental service instance
        RentalService service = new RentalService();

        //Adding vehicles to the service
        service.addVehicle(car1);
        service.addVehicle(car2);
        service.addVehicle(truck1);

        //Renting a vehicle
        service.rentVehicle(customer, "Toyota");

        //Displaying all vehicles sorted by price
        System.out.println("Vehicles sorted by price: ");
        service.sortVehiclesByPrice();
        service.displayVehicles();

        //Filtering available vehicles
        System.out.println("Available vehicles: ");
        ArrayList<Vehicle> availableVehicles = service.filterAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }
    }
}