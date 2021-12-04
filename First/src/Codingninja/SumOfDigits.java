package Codingninja;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        double a=sc.nextDouble();
        double sum=0;
        double b;
        while(a>0){
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.println(sum);
    }
}
