package L10.ColectiileJava.Set;

import java.util.Objects;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person() {
    }
    @Override
    public int compareTo(Person otherPerson) {
        if(this.equals(otherPerson)||this.hashCode()==otherPerson.hashCode())
            return 0;

        return Integer.compare(this.getAge(), otherPerson.getAge());

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
