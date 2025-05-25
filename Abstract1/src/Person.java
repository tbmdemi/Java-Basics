import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor cho chu so huu.
     *
     * @param name    ten
     * @param address dia chi
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Xoa mot phuong tien khoi danh sach so huu.
     *
     * @param registrationNumber bien so xe
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getRegistrationNumber(), registrationNumber)) {
                vehicleList.remove(vehicle);
            }
        }
    }

    /**
     * Thong tin cua phuong tien duoc so huu.
     *
     * @return thong tin cua phuong tien
     */
    public String getVehiclesInfo() {
        if (this.vehicleList.isEmpty()) {
            return this.name + " has no vehicle!";
        } else {
            StringBuilder sb = new StringBuilder(name + " has:\n\n");

            for (Vehicle vehicle : vehicleList) {
                sb.append(vehicle.getInfo()).append("\n");
            }
            return sb.toString();
        }
    }
}
