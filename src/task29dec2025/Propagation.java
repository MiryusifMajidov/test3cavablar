package task29dec2025;

public class Propagation {
    public static void method1(){
        try {
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("xeta bas verdi sebeb budur "+ e.getMessage());
        }
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        int a = 10/0;
    }
}
