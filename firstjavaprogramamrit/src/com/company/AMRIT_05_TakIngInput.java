package com.company;
import java.util.Scanner;

public class AMRIT_05_TakIngInput{
    public static void main(String[] args){
        System.out.println("Taking Input From The User");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
       // boolean b1= sc.hasNextInt();
       // System.out.println(b1);

        //System.out.println("Enter Number 2");

       //  boolean b2= sc.hasNextInt();
       // System.out.println(b2);
        System.out.println("Enter 3");
        float c= sc.nextFloat();
        System.out.println("Enter 4");
        float d=sc.nextFloat();
        System.out.println("Enter 5");
        float e=sc.nextFloat();


        float percentage=((a+b+c+d+e)*100)/500;
     //   float sum/500;
      //  System.out.println(percentage);

        System.out.print("The Percentage of Student in % is "+ percentage );

    }

}
