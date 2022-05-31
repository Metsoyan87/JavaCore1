package Tests;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person(176.3, "Gago", "Sargsyan");
        person.show(18);

        Person person1 = new Person(169.2,"Vlad", "Ginosyan");
        person1.show(29);

        Person person2 = new Person(160.8,"Saten", "popozyan");
        person2.show(45);
    }
}
