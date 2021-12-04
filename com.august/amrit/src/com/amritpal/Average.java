package com.amritpal;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        for(i=1;i<=10;i++){
            System.out.println("Enter your number");
            int num=sc.nextInt();
            sum=sum+num;
        }
        float average=sum/10;
        System.out.println("The average is "+average);
    }
}
