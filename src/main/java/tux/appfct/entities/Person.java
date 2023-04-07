package tux.appfct.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private Instant birthday;

    private Character genre;

    private String address;

    private String person;

    public Person() {
    }

    public Person(String name, Instant birthday, Character genre, String address, String person) {
        this.name = name;
        this.birthday = birthday;
        this.genre = genre;
        this.address = address;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getBirthday() {
        return birthday;
    }

    public void setBirthday(Instant birthday) {
        this.birthday = birthday;
    }

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return Objects.equals(name, person1.name) && Objects.equals(birthday, person1.birthday) && Objects.equals(genre, person1.genre) && Objects.equals(address, person1.address) && Objects.equals(person, person1.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, genre, address, person);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", genre=" + genre +
                ", address='" + address + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}
