package Tests;

public class Person {
    String name;
    String surname;
    double age;
    double growth;

    Person(Person ob) {
        this.name = ob.name;
        this.surname = ob.surname;
        this.age = ob.age;
        this.growth = ob.growth;
    }

    Person() {
    }
    public Person(String name, String surname, double age, double growth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.growth = growth;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (Double.compare(person.age, age) != 0) return false;
        if (Double.compare(person.growth, growth) != 0) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(age);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(growth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                '}';
    }

}
