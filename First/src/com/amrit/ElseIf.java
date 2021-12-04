package com.amrit;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>60) {
            System.out.println("you are senior citixen");
        }else if (age>50) {
            System.out.println("you are senior");
        }     else if(age>40) {
            System.out.println("you are young");
        }else {
            System.out.println("thanks");
        }
        if(age>12&&age<20){
            System.out.println("you are teenager");
        }

    }
}
