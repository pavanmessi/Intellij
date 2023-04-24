package kiran;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
                /*


        int max=a;
        if(b>max){
            max=b;
        } else if (c>max) {
            max=c;

        }
        System.out.println(max);


        /*
        int n = in.nextInt();
        int n = in.nextInt();
        for (int num = 1; num <=n ; num++) {
            System.out.println("Hello Worlld");

        }

        int num =1;
        while(num <=n){
            System.out.println("Helloworld");
            num++;
        }
        */

    }
}
