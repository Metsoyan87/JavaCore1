package Tests;

public class Person {

    double height;
    String name;
    String surname;

    Person() {
    }

    public Person(double h, String n, String s) {
        this.height = h;
        this.name = n;
        this.surname = s;
    }

    void show(int age) {
        System.out.println("height: " + height + " " + "name: " + name + " " + "surname: " + surname + "age: = " + age);
    }
}
