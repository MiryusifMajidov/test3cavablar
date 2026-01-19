package task29dec2025;


import java.lang.reflect.Array;
import java.util.Scanner;

import static task29dec2025.Propagation.method1;


public class main29dec {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);

       /* int a = scanner.nextInt();
        int b = scanner.nextInt();*/

        //int[] arr = {1,2,3,4,5};

        //method1();

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Mesaj: " + e.getMessage());
            System.out.println("Səbəb: " + e.getCause());
            e.printStackTrace();
        }

      /*  try {
            throw new InvalidPinException("test");
        } catch (InvalidPinException e) {
            System.out.println("PIN yanlışdır");
        } catch (InsufficientBalance e) {
            System.out.println("Balans yoxdur");
        } catch (DailyLimitExceeded e) {
            System.out.println("Günlük limit keçilib");
        }*/


      /*  BankAccount account = new BankAccount();
        account.withdraw(200);*/

        /*try{
            checkAge(12);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/


        /*int age = scanner.nextInt();
        if (age<18){

            throw new InvalidAgeException("yas duz deyil");
        }*/

        /*int age = scanner.nextInt();
        if (age<0 || age>120){
            throw new IllegalArgumentException("yas duz deyil");
        }*/


       /* try{
            //int ab = 10/0;
            String s = null;
            s.length();

        }
        catch (NullPointerException e){
            System.out.println("Xeta bas verdi "+ e.getMessage());
        }
        finally {
            System.out.println("salam");
        }*/


        /*try{
            //int ab = 10/0;
            String s = null;
            s.length();

        }
        catch (ArithmeticException e){
            System.out.println("Xeta bas verdi "+ e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Xeta bas verdi 2  "+ e.getMessage());
        }*/


       /* try{
            int ab = 10/0;
            String s = null;
            s.length();
        }
        catch (Exception e){
            System.out.println("Xeta bas verdi "+ e.getMessage());
        }*/


        /*String value = "ab";

        try {
            System.out.println(Integer.parseInt(value));

        }catch (NumberFormatException e){
            System.out.println("convert etmek olmur");
        }*/

       /* try {
            System.out.println(arr[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("bu index yoxdur");
        }*/

//        try {
//            System.out.println(a/b);
//
//        }catch (ArithmeticException e){
//            System.out.println("sifira bolmek olmaz");
//        }



    }

    public static void checkAge(int age) throws Exception{
        if (age<18){
            throw new Exception("yasi azdir");
        }
    }

}

