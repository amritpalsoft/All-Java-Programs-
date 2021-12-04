/*To check wheather a number is integer or not without using boolean*/
package com.amrit;
import java.util.Scanner;
public class ToCheckWithoutBoolean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value");

        System.out.println(sc.hasNextInt());

    }
}
