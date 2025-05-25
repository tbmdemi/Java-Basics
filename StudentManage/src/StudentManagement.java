import java.util.Scanner;

public class StudentManagement {

    //Hàm boolean sameGroup để check nếu hai sinh viên có chung một lớp
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    //Khai báo mảng students để lưu trữ các sinh viên
    Student[] students = new Student[100];
    int count = 0;

    // Hàm addStudent để thêm sinh viên mới vào mảng students
    public void addStudent(Student newStudent) {
        students[count] = newStudent;
        count++;
    }

    /**
     * Xếp các sinh viên theo lớp của mình.
     * @return string
     */
    public String studentsByGroup() {
        StringBuilder key = new StringBuilder();
        String[] groups = new String[100];
        int sameGr = 0;
        for (int i = 0; i < count; i++) {
            boolean found = false;
            for (int j = 0; j < sameGr; j++) {
                if (groups[j].equals(students[i].getGroup())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                groups[sameGr++] = students[i].getGroup();
            }
        }

        //chạy hàm loop for để thêm Info của học sinh vào String key
        for (int i = 0; i < sameGr; i++) {
            key.append(groups[i]).append("\n");
            for (int j = 0; j < count; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    key.append(students[j].getInfo()).append("\n");
                }
            }
        }

        return key.toString();
    }

    /**
     * Hàm removeStudent để xóa sinh viên từ mảng students.
     * @param id id
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i + 1; j < count; j++) {
                    students[j - 1] = students[j];
                }
                students[count - 1] = null;
                count--;
                break;
            }
        }
    }
}
