public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor cho MotorBike.
     *
     * @param brand              thuong hieu
     * @param model              kieu xe
     * @param registrationNumber bien so xe
     * @param owner              chu so huu
     * @param hasSidecar         xe thung
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;

    }

    /**
     * Kiem tra xem co thung ben hay khong.
     *
     * @return hasSideCar dung/sai
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Cai dat thung ben.
     *
     * @param hasSidecar co hay khong
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * Thong tin cua xe may.
     *
     * @return chuoi thong tin cua xe may
     */
    @Override
    public String getInfo() {
        String ownerInfo = "N/A";
        if (getOwner() != null) {
            String ownerName = getOwner().getName() != null ? getOwner().getName() : "";
            String ownerAddress = getOwner().getAddress() != null ? getOwner().getAddress() : "";
            ownerInfo = String.format("%s - %s", ownerName, ownerAddress);
        }

        String info = "Motor Bike:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + this.hasSidecar + "\n"
                + "\tBelongs to " + ownerInfo;

        return info;
    }
}
