package uni;

import java.util.ArrayList;

public class Course {
    private static int nextId = 1;
    public static ArrayList<Course> courseList = new ArrayList<>();

    private final int id;
    public final String title;
    public final int credits;

    public Course(String title, int credits) {
        this.id = nextId++;
        this.title = title;
        this.credits = credits;
        courseList.add(this);
    }

    public int getId() {
        return id;
    }

    public static Course findById(int id) {
        for (Course course : courseList) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}