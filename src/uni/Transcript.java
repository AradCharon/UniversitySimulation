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

    }

    public void printTranscript() {

    }

    public double getGPA() {

    }
}