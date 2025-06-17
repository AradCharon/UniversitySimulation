import base.Person;
import uni.*;

public class Main {
    public static void main(String[] args) {
        Major major1 = new Major("Computer Science", 60);
        Major major2 = new Major("Mathematics", 50);

        Person person1 = new Person("Ali", "0012345678");
        Person person2 = new Person("Nima", "0022345678");
        Person person3 = new Person("Arad", "0032345678");
        Person person4 = new Person("Mehdi", "0042345678");
        Person person5 = new Person("Behzad", "0052345678");

        Student student1 = new Student(person1.getId(), 1403, major1.getId());
        Student student2 = new Student(person2.getId(), 1402, major1.getId());
        Student student3 = new Student(person3.getId(), 1403, major2.getId());

        System.out.println("Student Information:");
        printStudentInfo(student1.getId());
        printStudentInfo(student2.getId());
        printStudentInfo(student3.getId());

        Professor professor1 = new Professor(person4.getId(), major1.getId());
        Professor professor2 = new Professor(person5.getId(), major2.getId());

        System.out.println("\nProfessor Information:");
        printProfessorInfo(professor1.getId());
        printProfessorInfo(professor2.getId());

        Course course1 = new Course("Advanced Programming", 3);
        Course course2 = new Course("Database", 3);
        Course course3 = new Course("Calculus 2", 2);

        PresentedCourse pc1 = new PresentedCourse(course1.getId(), professor1.getId(), 30);
        PresentedCourse pc2 = new PresentedCourse(course2.getId(), professor1.getId(), 25);
        PresentedCourse pc3 = new PresentedCourse(course3.getId(), professor2.getId(), 20);

        pc1.addStudent(student1.getId());
        pc1.addStudent(student2.getId());

        pc2.addStudent(student1.getId());
        pc2.addStudent(student2.getId());
        pc2.addStudent(student3.getId());

        pc3.addStudent(student3.getId());

        Transcript transcript1 = new Transcript(student1.getId());
        transcript1.setGrade(pc1.getId(), 18.5);
        transcript1.setGrade(pc2.getId(), 17.0);

        Transcript transcript2 = new Transcript(student2.getId());
        transcript2.setGrade(pc1.getId(), 16.0);
        transcript2.setGrade(pc2.getId(), 19.5);

        Transcript transcript3 = new Transcript(student3.getId());
        transcript3.setGrade(pc2.getId(), 15.5);
        transcript3.setGrade(pc3.getId(), 20.0);

        System.out.println("\nStudent Transcripts:");
        transcript1.printTranscript();
        System.out.println("GPA: " + transcript1.getGPA());

        transcript2.printTranscript();
        System.out.println("GPA: " + transcript2.getGPA());

        transcript3.printTranscript();
        System.out.println("GPA: " + transcript3.getGPA());
    }

    private static void printStudentInfo(int studentId) {
        Student student = Student.findById(studentId);
        Person person = Person.findById(student.personID);
        Major major = Major.findById(student.majorID);

        System.out.println("Name: " + person.name +
                ", Student ID: " + student.studentID +
                ", Major: " + major.name);
    }

    private static void printProfessorInfo(int professorId) {
        Professor professor = Professor.findById(professorId);
        Person person = Person.findById(professor.personID);
        Major major = Major.findById(professor.majorID);

        System.out.println("Name: " + person.name +
                ", Professor ID: " + professor.getId() +
                ", Department: " + major.name);
    }
}