import java.io.*;

public class BasicSerializationDemo {
    public static void saveStudent(Student student, String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(student);
            System.out.println("Telebe ugurla elave olundu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student loadStudent(String fileName){
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(fileName))) {
            Student student = (Student) oos.readObject();
            System.out.println("Student oxundu");
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
