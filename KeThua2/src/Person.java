public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
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

    /**
     * Convert to String.
     * @return String
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
