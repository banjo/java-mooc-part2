package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (name == null || name.isEmpty() || age < 0 || age > 120 || name.length() > 40 || name.length() < 0 ){
            throw new IllegalArgumentException("Try again.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
