/* Program to print first 'n' even numbers.
    2*i used for even no
    2*i+1 used for odd no
 */
package com.amrit;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for (int i=0;i<=n;i++){

            System.out.println(2*i);
        }

    }
}
