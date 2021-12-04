package com.amrit;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        switch (age) {
            case (18) -> System.out.println("you are going to be adult");
            case 20 -> System.out.println("you are adult");
            case 30 -> System.out.println("you are");
            default -> System.out.println("good life");
        }
    }
}
