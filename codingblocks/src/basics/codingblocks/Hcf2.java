package basics.codingblocks;
import java.util.Scanner;
public class Hcf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divisor");
        int divisor= sc.nextInt();
        System.out.println("Enter the dividend");
        int dividend= sc.nextInt();

        while (dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;

        }
        System.out.println(divisor);
    }
}
