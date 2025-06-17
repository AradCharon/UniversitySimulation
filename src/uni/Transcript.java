package uni;

import base.Person;
import java.util.HashMap;

public class Transcript {
    public final int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        PresentedCourse pc = PresentedCourse.findById(presentedCourseID);
        if (pc != null && pc.students.contains(studentID)) {
            transcript.put(presentedCourseID, grade);
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    public void printTranscript() {

    }

    public double getGPA() {

    }
}