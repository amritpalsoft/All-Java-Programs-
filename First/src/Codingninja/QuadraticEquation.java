package Codingninja;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double D=b*b-4*a*c;
        double E=Math.sqrt(D);
        double quad1=((-b+E)/(2*a));
        double quad2=((-b-E)/(2*a));
        System.out.printf("The roots of this quadratic equation is %f and %f",quad1,quad2);
    }
}
