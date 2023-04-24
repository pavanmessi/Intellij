package kiran;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class HOME {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please a number from 1-7: ");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");

                }
                System.out.println();

            }

        }


    }




