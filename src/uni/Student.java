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

    public int getId() {
        return id;
    }

    private void setStudentCode() {
        String lastTwoDigitsOfYear = String.valueOf(entranceYear % 1000);
        String majorCode = (majorID < 10) ? "0" + majorID : "" + majorID;
        String studentNumber;
        if (id < 10) {
            studentNumber = "00" + id;
        } else if (id < 100) {
            studentNumber = "0" + id;
        } else {
            studentNumber = "" + id;
        }
        this.studentID = lastTwoDigitsOfYear + majorCode + studentNumber;
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