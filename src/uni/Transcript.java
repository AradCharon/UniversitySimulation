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
        Student student = Student.findById(studentID);
        Person person = Person.findById(student.personID);

        System.out.println("Student Transcript:");
        System.out.println("Name: " + person.name);
        System.out.println("Student ID: " + student.studentID);
        System.out.println("---------------------------------------");

        for (Integer courseId : transcript.keySet()) {
            PresentedCourse course = PresentedCourse.findById(courseId);
            Course courseInfo = Course.findById(course.courseID);
            System.out.println(courseInfo.title + ": " + transcript.get(courseId));
        }
    }

    public double getGPA() {

    }
}