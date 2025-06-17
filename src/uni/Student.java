package uni;

import base.Person;
import java.util.ArrayList;

public class Student {
    private static int nextId = 1;
    public static ArrayList<Student> studentList = new ArrayList<>();

    private final int id;
    public final int personID;
    public final int entranceYear;
    public final int majorID;
    public String studentID;

    public Student(int personID, int entranceYear, int majorID) {
        this.id = nextId++;
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;

        Major major = Major.findById(majorID);
        if (major != null) {
            major.addStudent();
        }

        setStudentCode();
        studentList.add(this);
    }

    private void setStudentCode() {

    }

    public int getId() {
        return id;
    }

    public static Student findById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}