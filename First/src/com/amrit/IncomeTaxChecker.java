package com.amrit;
import java.util.Scanner;
public class IncomeTaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income per Annum in Lpa:");
        double income = sc.nextFloat();
        double tax5 = income * ((.05));
        double tax20 = income * ((.2));
        double tax30 = income * ((.3));
        if ((income > 250000) && (income < 500000)) {
            System.out.println("Your Total Tax Amount Is: " + tax5);
        } else if ((income > 500000) && (income < 1000000)) {
            System.out.println("Your Total Tax Amount Is: " + tax20);
        } else if ((income > 1000000)) {
            System.out.println("Your Total Tax Amount Is: " + tax30);
        } else{
            System.out.println("You are not liable to pay income tax");
    }

 }
}
