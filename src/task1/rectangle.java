package task1;

public class rectangle extends shape {
    double length, width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
