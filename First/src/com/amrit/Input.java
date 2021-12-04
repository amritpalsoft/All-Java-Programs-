/*To check wheather a input number is integer or not*/
package com.amrit;
import java.util.Scanner;

    public class Input {
        public static void main(String[] args) {
            System.out.println("Taking input from the user");
            Scanner sc=new Scanner(System.in);

            boolean b1= sc.hasNextInt();
            System.out.println(b1);
        }

    }
