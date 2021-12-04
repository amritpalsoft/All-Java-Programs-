package com.amritpal;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        double number = sc.nextInt();
        double factorial=1;
     //   if(number==0||number==1)
        while(number>0){
            factorial=factorial*number;
            number--;
        }
        System.out.println(factorial);

    }
}