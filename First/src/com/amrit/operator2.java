/*When we use +=3 we means add 3 to the above number
  Sme goes with *= /= %= and so on */
package com.amrit;
import java.util.Scanner;
public class operator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println(a %=3);
    }
}
