package kiran;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b= 1;
        int Count = 2;
        while(Count <= n){
            int temp = b;
            b=b+a;
            a=temp;
            Count++;
        }
        System.out.println(b);

    }
}
