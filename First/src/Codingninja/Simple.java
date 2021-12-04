package Codingninja;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
            int principal;
            float rate;
            int year;
            principal=sc.nextInt();
            rate=sc.nextFloat();
            year=sc.nextInt();
            int SimpleInterest= (int) ((principal*year*rate)/100);
            System.out.print(SimpleInterest);
    }
}
