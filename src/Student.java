import java.io.*;

public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    @MyAnnotation(onlyUpperCase = true, length = 8)
    public String name;
    @MyAnnotation(onlyInt = true)
    public transient int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age='%d'}", name, age);
    }
}
