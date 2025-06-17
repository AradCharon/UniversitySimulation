package uni;

import java.util.ArrayList;

public class PresentedCourse {
    private static int nextId = 1;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();

    private final int id;
    public final int courseID;
    public final int professorID;
    public final int capacity;
    public ArrayList<Integer> students;

    public PresentedCourse(int courseID, int professorID, int capacity) {
        this.id = nextId++;
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = capacity;
        this.students = new ArrayList<>(capacity);
        presentedCourseList.add(this);
    }

    public static PresentedCourse findById(int id) {

    }

    public void addStudent(int studentID) {

    }
}