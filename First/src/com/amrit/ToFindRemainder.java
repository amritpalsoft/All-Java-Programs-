/*To find the remainder when one number is divided by another
   It is called modulas operator(%)*/
package com.amrit;
import java.util.Scanner;
public class ToFindRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a=sc.nextInt();
        System.out.println("Enter num");
        int b=sc.nextInt();
        System.out.print("The remainder is ");
        int remainder=a%b;
        System.out.println(remainder);
    }
}
