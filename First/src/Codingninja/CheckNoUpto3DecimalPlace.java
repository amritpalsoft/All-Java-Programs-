package Codingninja;
import java.util.Scanner;
public class CheckNoUpto3DecimalPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :  \n");
        float num1=sc.nextFloat();
        System.out.print("Enter the number 2 :\n ");
        float num2=sc.nextFloat();
        num1=Math.round(num1*10000);
        num1=num1/10000;
        num2=Math.round(num2*10000);
        num2=num2/10000;
        if(num1==num2) {
            System.out.println("both are equal");
        }else{
            System.out.println("not equal");

        }
    }
}
