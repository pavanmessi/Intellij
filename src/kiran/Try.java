package kiran;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        a = Math.round(a *1000);
        a=a/1000;
        b=Math.round(b*1000);
        b=b/1000;
        if (a==b){
            System.out.println("they are same");
        }
        else{
            System.out.println("they are different");
        }
    }
}
