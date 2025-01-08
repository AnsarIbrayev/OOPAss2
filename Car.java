class Car extends Vehicle {
    private int numberOfDoors;

    //Constructor
    public Car(String type, String brand, double pricePerDay, boolean isAvailable, int numberOfDoors) {
        super(type, brand, pricePerDay, isAvailable);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfDoors: " + numberOfDoors + '}';
    }
}