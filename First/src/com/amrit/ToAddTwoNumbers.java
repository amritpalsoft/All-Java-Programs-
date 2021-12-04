/*To Add Two Integer Numbers*/
package com.amrit;
import java.util.Scanner;
public class ToAddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Two Add Two Numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        System.out.println("The sum is");
        int sum=a+b;
        System.out.println(sum);
    }
}
