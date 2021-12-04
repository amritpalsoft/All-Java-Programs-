/*To calculate percentage of a student
    Rsult nikalte samy humko integer ki jagah float hi lena chahiye kyoki nahi
     to points me percentage nahi aa payega.*/
package com.amrit;
import java.util.Scanner;
public class CbsePercentageCalculator {
    public static void main(String[] args) {
        System.out.println("To Calculate the Percentage of student");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Marks Of Subject");
        int totalmarks= sc.nextInt();
        System.out.println("Enter marks in Science");
        int science= sc.nextInt();
        System.out.println("Enter marks in Maths");
        int maths=sc.nextInt();
        System.out.println("Enter marks in English");
        int english=sc.nextInt();
        System.out.println("Enter marks in Hindi");
        int hindi=sc.nextInt();
        System.out.println("Enter marks in Social Science");
        int socialscience=sc.nextInt();
        int percentage=(((maths+science+english+hindi+socialscience)*100)/(totalmarks*5));
        System.out.println("The percentage of Student in % is "+ percentage);
        System.out.print("Congratulations " + "Aim For Better");
    }
}
