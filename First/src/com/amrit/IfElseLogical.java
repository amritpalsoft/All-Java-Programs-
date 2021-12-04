package com.amrit;
import java.util.Scanner;
public class IfElseLogical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        if((a%2==0)||(b%2==0)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");

        }
    }
}
