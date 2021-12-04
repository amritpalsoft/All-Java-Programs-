package com.amrit;
import java.util.Scanner;
public class SumOf {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            sum=sum+(2*i+1);
        }
        System.out.print("sum "+ sum);
    }
}
