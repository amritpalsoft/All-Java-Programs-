package Codingninja;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary;
        int years;
        System.out.print("Enter your salary : ");
        salary=sc.nextFloat();
        System.out.print("For how many years you are working in this company : ");
        years=sc.nextInt();
        if(years>5) {
            float bonus = salary * (.05f);
            System.out.print("your bonus amount in Rs is :" + bonus);
        }else{
            System.out.println("Yo are not eligible for bonus");

        }
    }
}
