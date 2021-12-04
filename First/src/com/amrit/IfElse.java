
package com.amrit;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age!=8) {
            System.out.println("You can drive");
        } else{
            System.out.println("Try later");
        }
    }
}
