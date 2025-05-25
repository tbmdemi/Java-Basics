import java.util.IdentityHashMap;

public class StudentManagement {
    Student[] students = new Student[100];
    int count = 0;

    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[count] = newStudent;
        count ++;
    }

    public String studentsByGroup() {
        String result = "";
        String[] groups = new String[100];
        int numOfGroup = 0;
        for(Student student : students) {
            boolean found = false;
            for (String group : groups) {
                if (group.equals(student.getGroup())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                groups[numOfGroup++] = student.getGroup();
            }
        }

        for (String group : groups){
            result += group + "\n";
            for (Student student : students) {
                if(student.getGroup().equals(group)) {
                    result += student.getInfo() + "\n";
                }
            }
        }

        return result;
    }

    public void removeStudent(String id){
        for (int i = 0; i < count ; i++){
            if (students[i].getId().equals(id)){
                for (int j = i ; j < count - 1; j++){
                    students[j] = students[j+1];
                }
                count --;
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student s1 = new Student("Trinh Binh Minh", "24022413", "24022413@vnu.edu.vn");
        Student s2 = new Student("Trinh Binh", "24022414", "24022414@vnu.edu.vn");
        Student s3 = new Student("Trinh", "24022415", "24022415@vnu.edu.vn");
        Student s4 = new Student("Trinh trieu", "24022416", "24022416@vnu.edu.vn");
    }
}
