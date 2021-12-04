package com.amritpal;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b;
        System.out.print("Enter your number : ");
        b=sc.nextInt();
        if(a>=b) {
            System.out.println("Good");
        }else{
            System.out.println("Try Again");
        }


    }
}
