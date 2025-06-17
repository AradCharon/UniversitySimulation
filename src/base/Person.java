package base;

import java.util.ArrayList;

public class Person {
    private static int nextId = 1;
    public static ArrayList<Person> personList = new ArrayList<>();

    private final int id;
    public String name;
    public String nationalID;

    public Person(String name, String nationalID) {
        this.id = nextId++;
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
    }

    public int getId() {
        return id;
    }

    public static Person findById(int id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}