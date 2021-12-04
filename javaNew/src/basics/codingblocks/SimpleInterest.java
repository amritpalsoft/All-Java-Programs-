package basics.codingblocks;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        float p=sc.nextInt();
        System.out.println("Enter the rate");
        float r=sc.nextInt();
        System.out.println("Enter the time period");
        float t=sc.nextInt();
        float si=(p*r*t)/100;
        System.out.printf("The simple interest is %f",si);
    }
}
