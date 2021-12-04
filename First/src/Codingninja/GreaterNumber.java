package Codingninja;
import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number 1 : ");
        int no1=sc.nextInt();
        System.out.print("enter number 2 : ");
        int no2=sc.nextInt();
        if(no1>no2) {
            System.out.println(no1);
        }else {
            System.out.println(no2);
        }
    }
}
