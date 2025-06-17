package uni;

import java.util.ArrayList;

public class PresentedCourse {
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();

    private final int id;
    public final int courseID;
    public final int professorID;
    public final int capacity;
    public ArrayList<Integer> students;

    public PresentedCourse(int courseID, int professorID, int capacity) {

    }

    public static PresentedCourse findById(int id) {

    }

    public void addStudent(int studentID) {

    }
}