package uni;

import java.util.ArrayList;

public class Major {
    private static int nextId = 1;
    public static ArrayList<Major> majorList = new ArrayList<>();

    private final int id;
    public final String name;
    public final int capacity;
    public int numberOfStudents;

    public Major(String name, int capacity) {
        this.id = nextId++;
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = 0;
        majorList.add(this);
    }

    public static Major findById(int id) {

    }

    public void addStudent() {

    }
}