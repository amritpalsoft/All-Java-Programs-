package Codingninja;
import java.util.Scanner;
public class SwappingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a : ");
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.printf("The swapped values are %d and %d\n",a,b );
        System.out.println("The value are "       +a+ " and " +b);

    }
}
