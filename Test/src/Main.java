import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String input = "Nguyen van a 123456789";

        String[] parts = input.split("\\s+(?=\\d{9}$)", 2);
        String name = parts[0];
        String id = parts[1];

        System.out.println(name);
        System.out.println(id);
    }
}