package kiran;

import java.util.Scanner;

public class oddd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(n % 2==0){
                System.out.println( "even numbers are : "+  n);

            }else{
                System.out.println("odd numbers are:" + n);
            }

        }

    }
}
