public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     *Contructor để khởi tạo giá trị mặc định của Student.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * contructor để nhận giá trị của Student.
     * @param name name
     * @param id id
     * @param email email
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor.
     * @param s hoc sinh
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email  = s.email;
    }

    /**
     * Tra ve ten.
     * @return ten
     */
    public String getName() {
        return name;
    }

    /**
     * Thay doi ten.
     * @param name ten
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Tra ve id.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Thay doi id.
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Tra ve group.
    */
    public String getGroup() {
        return group;
    }

    /**
     * Thay doi group.
     * @param group group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Tra ve email.
    */
    public String getEmail() {
        return email;
    }

    /**
     * Thay doi email.
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Tra ve thông tin học sinh.
     * @return thông tin học sinh
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}