package kiran;
//for (int i = 1; i <= n; i++) {
//        for (int j = i; j <= n; j++) {
//        System.out.print("  ");
//        }

import java.util.Scanner;

public class Lets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
