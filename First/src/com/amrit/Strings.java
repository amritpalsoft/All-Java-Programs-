/* In this code we are also using 'prinf' in which we use
   %d for integers
   %f for floats
   %c for characters
   %s for strings
   if we are using float then if in %f we write %.2f then it only shows result upto
   two digits after point
 */
package com.amrit;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name");
        String name=sc.nextLine();
        System.out.print("Enter the roll no");
        float a= sc.nextFloat();
        System.out.printf("The name of student is %s and the roll number is %.1f",name,a);

    }
}
