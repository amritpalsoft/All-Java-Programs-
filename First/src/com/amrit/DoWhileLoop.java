package com.amrit;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number from where to start");
        int i=sc.nextInt();
        System.out.println("enter the number where to end");
        int n=sc.nextInt();
        ++i;
        do {

            System.out.println(i);
            i++;
        } while (i<=n);
        System.out.println("loop completed");


    }
}
