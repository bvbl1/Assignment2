package Pakazh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Student Abylay = new Student("Abylay", "Moldakhmet", 3.86);
        Student NabegiOM = new Student("Na", "Be", 3.3);
        Employee surf = new Employee("Ermek", "Orazbaev", 1230000);
        Employee Alexus = new Employee("Alikhan", "Borashek", 4127864);
        people.add(Abylay);
        people.add(NabegiOM);
        people.add(surf);
        people.add(Alexus);
        Collections.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return Double.valueOf(o1.getPaymentAmount()).compareTo(o2.getPaymentAmount());
            }
        });
        System.out.println(people);
    }
}