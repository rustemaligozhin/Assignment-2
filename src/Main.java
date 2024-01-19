import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Employee("John", "Lennon", "Employee", 27045.78));
        personArrayList.add(new Employee("George", "Harrison", "Employee", 50000.00));
        personArrayList.add(new Student("Ringo", "Star", 1.24));
        personArrayList.add(new Student("Paul", "McCartney", 3.24));

        Collections.sort(personArrayList);

        printData(personArrayList);


    }
    public static void printData(Iterable<Person> personArrayList){
        for (Person person : personArrayList){
            System.out.println(person.toString());
        }
    }
}