class Customer {
    private String name;
    private int age;
    private String licenceNumber;

    //Constructor
    public Customer(String name, int age, String licenceNumber) {
        this.name = name;
        this.age = age;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    @Override
    public String toString() {
        return "Customer{name: '" + name + "', age: " + age + ", licenseNumber: '" + licenceNumber + "'}";
    }
}