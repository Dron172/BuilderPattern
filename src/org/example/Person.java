package org.example;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = null;
        this.address = null;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = null;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.age = null;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return (this.age != null) ? true : false;
    }

    public boolean hasAddress() {
        return (this.address != null) ? true : false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        if (this.age != null) {
            this.age++;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!surname.equals(person.surname)) return false;
        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.getSurname())
                .setAddress(this.getAddress())
                .setAge(0);
    }
}
