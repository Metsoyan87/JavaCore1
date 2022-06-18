package Tests;

public class Person1 extends Person{
    int  phoneNumber;

    public Person1(Person ob, int phoneNumber) {
        super(ob);
        this.phoneNumber = phoneNumber;
    }

    public Person1(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person1(String name, String surname, double age, double growth, int phoneNumber) {
        super(name, surname, age, growth);
        this.phoneNumber = phoneNumber;
    }
}
