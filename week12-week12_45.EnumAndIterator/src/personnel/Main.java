package personnel;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Person arto = new Person("Arto", Education.D);
        Employees emp = new Employees();
        emp.add(arto);
        emp.fire(Education.D);
        emp.print();
    }
}
