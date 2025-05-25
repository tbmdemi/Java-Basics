public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    public Person() {
    }

    /**
     * Constructor co tham so.
     *
     * @param name    ten.
     * @param age     tuoi.
     * @param address dia chi.
     */
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * So sanh ten truoc tuoi sau.
     *
     * @param p the object to be compared.
     * @return thu tu.
     */
    @Override
    public int compareTo(Person p) {
        if (this.name.equals(p.name)) {
            return this.age - p.age;
        }
        return this.name.compareTo(p.name);
    }
}
