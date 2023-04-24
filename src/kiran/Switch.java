package kiran;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tues");
            case 3 -> System.out.println("thurs");
            case 4 -> System.out.println("wednessday");
            case 5 -> System.out.println("Frui");
            case 6 -> System.out.println("Satu");
            case 7 -> System.out.println("Sunday");

        }
    }
}
