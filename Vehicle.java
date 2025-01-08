abstract class Vehicle {
    private String type;
    private String brand;
    private double pricePerDay;
    private boolean isAvailable;

    //Constructor
    public Vehicle(String type, String brand, double pricePerDay, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    //Getters and setters
    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Vehicle{type: '" + type + "', brand: '" + brand + "', pricePerDay: " + pricePerDay + ", isAvailable: " + isAvailable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return Double.compare(vehicle.pricePerDay, pricePerDay) == 0 && isAvailable == vehicle.isAvailable && type.equals(vehicle.type) && brand.equals(vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, pricePerDay, isAvailable);
    }
}