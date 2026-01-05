package task2;

public class ExceptionTask {
    public static int divide(int a, int b) throws DivisionByZeroException{
        if (b==0){
            throw new DivisionByZeroException("Division by zore is not allowed");
        }
        return a/b;
    }
}
