package com.amrit;
import java.util.Scanner;
public class CheckPassOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks in each subject");
        float marks=sc.nextFloat();
        System.out.println("Enter marks in Science");
        float science=sc.nextFloat();
        System.out.println("Enter marks in math");
        float math=sc.nextFloat();
        System.out.println("Enter marks in English");
        float english=sc.nextFloat();
        float percentage=((science+math+english)/3);
        System.out.println("Your marks in % is " +percentage);
        if ((science>33)&&(math>33)&&(english>33)&&(percentage>40)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
