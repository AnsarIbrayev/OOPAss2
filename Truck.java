class Truck extends Vehicle {
    private double loadCapacity;

    //Constructor
    public Truck(String type, String brand, double pricePerDay, boolean isAvailable, double loadCapacity) {
        super(type, brand, pricePerDay, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", loadCapacity: " + loadCapacity + '}';
    }
}