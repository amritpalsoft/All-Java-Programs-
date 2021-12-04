package com.amrit;
import java.util.Scanner;
public class ToCheckWEbsiteStart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Website URL");
        String website=sc.nextLine();
        boolean org=website.endsWith(".org");
        boolean com=website.endsWith(".com");
        boolean in=website.endsWith(".in");
        if(org) {
            System.out.println("This is an organisation website");
        } else if (com) {
            System.out.println("This is a commercial website");
        } else if(in){
            System.out.println("This is a indian website");

        }
    }
}
