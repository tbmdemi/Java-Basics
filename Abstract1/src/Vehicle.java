public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor cua phuong tien.
     *
     * @param brand              thuong hieu
     * @param model              kieu xe
     * @param registrationNumber bien so xe
     * @param owner              chu so huu
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public abstract String getInfo();

    /**
     * Chuyen chu so huu phuong tien.
     *
     * @param newOwner chu moi
     */
    public void transferOwnership(Person newOwner) {
        setOwner(newOwner);
    }

}