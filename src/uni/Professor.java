package uni;

import base.Person;
import java.util.ArrayList;

public class Professor {
    private static int nextId = 1;
    public static ArrayList<Professor> professorList = new ArrayList<>();

    private final int id;
    public final int personID;
    public final int majorID;

    public Professor(int personID, int majorID) {
        this.id = nextId++;
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
    }

    public int getId() {
        return id;
    }

    public static Professor findById(int id) {
        for (Professor professor : professorList) {
            if (professor.getId() == id) {
                return professor;
            }
        }
        return null;
    }
}