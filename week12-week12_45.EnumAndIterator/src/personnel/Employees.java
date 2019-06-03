package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        if (!employees.contains(person)) {
            employees.add(person);
        }
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            add(person);
        }
    }

    public void print() {
        // print with iterator
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }

    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();


        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
