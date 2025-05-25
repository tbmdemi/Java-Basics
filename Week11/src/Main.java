import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nguyen A", 22, "Thanh hoa"));
        people.add(new Person("Nguyen A", 20, "Thanh hoa"));
        people.add(new Person("Le B", 22, "Thanh hoa"));

        List<Person> sortedPeople = Week11.sortGeneric(people);
        for (Person p : sortedPeople) {
            System.out.println(p.getName());
        }
    }
}