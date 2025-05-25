public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor cho xe oto.
     *
     * @param brand              thuong hieu
     * @param model              kieu xe
     * @param registrationNumber bien so xe
     * @param owner              chu so huu
     * @param numberOfDoors      so canh cua
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Lay so canh cua.
     *
     * @return so canh cua
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Thay so canh cua.
     *
     * @param numberOfDoors so canh cua
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    /**
     * Thong tin cua xe oto.
     *
     * @return chuoi thong tin cua oto
     */
    @Override
    public String getInfo() {
        String ownerInfo = "N/A"; // Giá trị mặc định nếu không có chủ hoặc thiếu thông tin
        if (getOwner() != null) {
            String ownerName = getOwner().getName() != null ? getOwner().getName() : "N/A";
            String ownerAddress = getOwner().getAddress() != null ? getOwner().getAddress() : "N/A";
            ownerInfo = String.format("%s - %s", ownerName, ownerAddress);
        }

        StringBuilder info = new StringBuilder();
        info.append("Car:\n");
        info.append("\tBrand: ").append(getBrand()).append("\n");
        info.append("\tModel: ").append(getModel()).append("\n");
        info.append("\tRegistration Number: ").append(getRegistrationNumber()).append("\n");
        info.append("\tNumber of Doors: ").append(this.numberOfDoors).append("\n");
        info.append("\tBelongs to ").append(ownerInfo);

        return info.toString();
    }
}
