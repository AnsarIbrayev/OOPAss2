import java.util.ArrayList;
import java.util.Comparator;

class RentalService {
    private ArrayList<Vehicle> vehicles;

    public RentalService() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(Customer customer, String brand) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().equalsIgnoreCase(brand) && vehicle.isAvailable()) {
                vehicle.setAvailable(false);
                System.out.println(customer.getName() + " rented " + vehicle.getBrand());
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }

    public void sortVehiclesByPrice() {
        vehicles.sort(Comparator.comparingDouble(Vehicle::getPricePerDay));
    }

    public ArrayList<Vehicle> filterAvailableVehicles() {
        ArrayList<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}