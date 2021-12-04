package com.amrit;
import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Hello Welcome "+ name+ " have a good day");
    }
}
