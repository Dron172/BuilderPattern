package org.example;

public class PersonBuilder implements IPersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) throws IllegalArgumentException {
        this.age = age;
        if (age != null && (age < 0 || age > 130)) {
            throw new IllegalArgumentException ("Некорректный возраст!");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() throws IllegalStateException {

        if (name == null || surname == null) {
            throw new IllegalStateException("Недостаточно данных (поля name и surname обязательны для заполнения!)");
        }

        if (age != null && address != null) {
            return new Person(name, surname, age, address);
        }
        if (age != null && address == null) {
            return new Person(name, surname, age);
        }
        if (age == null && address != null) {
            return new Person(name, surname, address);
        }
        return new Person(name, surname);
    }
}