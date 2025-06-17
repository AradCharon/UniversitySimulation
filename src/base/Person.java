package base;

import java.util.ArrayList;

public class Person {
    public static ArrayList<Person> personList = new ArrayList<>();

    private final int id;
    public String name;
    public String nationalID;

    public Person(String name, String nationalID) {

    }

    public static Person findById(int id) {

    }
}