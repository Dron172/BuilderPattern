package main;

import org.example.Person;
import org.example.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son;
        son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + "\n" + son);
    }
}
