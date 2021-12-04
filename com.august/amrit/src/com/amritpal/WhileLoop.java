package com.amritpal;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int i;
        int sum=0;
        System.out.println("enter the no");
        i=sc.nextInt();
        if(i>0) {
            while (a <= 10) {
                System.out.println(i + "*" + a + "=" + (a * i));
                a++;
            }
            //   System.out.println(sum);
        }else{
            System.out.println("negative no not allowed");
        }



    }
}
