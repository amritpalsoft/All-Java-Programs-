package Codingninja;
import java.util.Scanner;
public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        if(num>0) {
            System.out.print("Numbe ris positive\n");
        }else{
            System.out.println("Number is negative");

        }
    }
}
