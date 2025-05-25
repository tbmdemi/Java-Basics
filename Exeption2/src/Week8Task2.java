import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    /**
     * Thuc hien sai.
     */
    public void nullPointerEx() {
        String wrong = null;
        System.out.println(wrong.length());
    }

    /**
     * Tra ve loi.
     *
     * @return "nullPointerExTest()"
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * Thuc hien sai.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] wrong = new int[1];
        System.out.println(wrong[1000000]);
    }

    /**
     * Tra ve loi.
     *
     * @return "arrayIndexOfBoundsExtest()"
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * Thuc hien sai.
     */
    public void arithmeticEx() {
        int wrong = 0 / 0;
        System.out.println(wrong);
    }

    /**
     * Tra ve loi.
     *
     * @return "arithmeticExTest"
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            // Trả về tên phương thức test theo yêu cầu của bảng
            return "Lỗi Arithmetic";
        }
    }

    /**
     * Thuc hien sai.
     *
     * @throws FileNotFoundException kh tim thay file
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("wrong_file.txt");
        FileInputStream fiInput = new FileInputStream(file);
        try {
            fiInput.close();
        } catch (IOException ioException) {
            System.out.println("Lỗi File Not Found");
        }
    }

    /**
     * Tra ve loi.
     *
     * @return filenotfound
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * Thuc hien sai.
     *
     * @throws IOException loi
     */
    public void ioEx() throws IOException {
        File file = new File("wrong_file.txt");
        FileInputStream fis = new FileInputStream(file);
        fis.close();
    }

    /**
     * Tra ve loi.
     *
     * @return ioExTest
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) { // Bắt IOException chung
            // Trả về tên phương thức test theo yêu cầu của bảng
            return "Lỗi IO";
        }
    }
}