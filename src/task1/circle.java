package task1;

public class circle extends shape {
    double radius;
    public circle(double radius){
        this.radius = radius;
    }


    @Override
    public double area() {
        return 3.2 * radius * radius;
    }
}
