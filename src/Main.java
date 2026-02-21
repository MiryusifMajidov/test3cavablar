

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Student student = new Student(20, "MİRİMİRİ");
        //Student student2 = new Student(20, "mirimiri");

        Validator.validate(student);
        //Validator.validate(student2);
        /*BasicSerializationDemo.saveStudent(student, "student.ser");

        Student loadStudent = BasicSerializationDemo.loadStudent("student.ser");
        System.out.println(loadStudent);*/

        /*Class<String> s = String.class;

        Method method = Student.class.getMethod("toString");
        Object result  = method.invoke(student);

        Field field = Student.class.getField("name");

        System.out.println(field.get(student));

        field.set(student, "ALi");

        System.out.println(field.get(student));*/


    }
}
