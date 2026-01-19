package task16dec2025;

import task16dec2025.task2.Day;
import task16dec2025.task3.TrafficLight;

public class main16dec {
    public static void main(String[] args) {
       /* Calculator addition = Integer::sum;
        Calculator multiplication = (a, b)->a*b;

        System.out.println(addition.operate(12,10));
        System.out.println(multiplication.operate(12,10));*/

        //getDay(Day.FRIDAY);

        light(TrafficLight.RED);


    }

    public static void getDay(Day day){
        switch (day){
            case MONDAY -> System.out.println("weekday ");
            case TUESDAY -> System.out.println("weekday ");
            case WEDNESDAY -> System.out.println("weekday ");
            case THURSDAY -> System.out.println("weekday ");
            case FRIDAY -> System.out.println("weekday ");
            case SATURDAY -> System.out.println("weekend ");
            case SUNDAY -> System.out.println("weekend ");

            default -> System.out.println("tapilmadi ");
        }

    }

    public static void light(TrafficLight light){
        switch (light){
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("get ready");
            case GREEN -> System.out.println("go");
            default -> System.out.println("tapilmadi");
        }
    }
}

