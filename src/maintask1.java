import task1.*;

public class maintask1 {
    public static void main(String[] args) {
        shape shape1 = new circle(5);
        shape shape2 = new rectangle(4, 6);

        System.out.println("Area of Circle: " + shape1.area());
        System.out.println("Area of Rectangle: " + shape2.area());
    }
}

