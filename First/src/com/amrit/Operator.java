/*If we write ++ before a number then it will be increased in the next result
  But if we write ++ after a number then it means first print the number then increase it
  same applies to --  */

package com.amrit;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a= sc.nextInt();
        System.out.println("The Incremented Number is "+ ++a);
    }
}
