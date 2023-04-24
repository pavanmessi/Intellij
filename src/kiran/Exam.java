package kiran;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the input : ");
        int input = in.nextInt();

        if(input >0)
        {
            System.out.println("Given number id posistive");

        }
        else{
            System.out.println("Given number is a negative number");

        }

        System.out.println(input);
    }
}
