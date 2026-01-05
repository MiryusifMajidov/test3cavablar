package task5;

public class Course {
    String courseName;
    String instructor;
    int credits;


    public Course(String courseName, String instructor, int credits)
    {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void display()
    {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}
