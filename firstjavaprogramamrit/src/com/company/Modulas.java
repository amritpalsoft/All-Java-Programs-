package com.company;
import java.util.Scanner;
public class Modulas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1");
        float a=sc.nextFloat();
        System.out.println("Enter no 2");
        float b= sc.nextFloat();
        float modulas=(a%b);
        System.out.println("The remainder is");
        System.out.println(modulas);

    }
}
