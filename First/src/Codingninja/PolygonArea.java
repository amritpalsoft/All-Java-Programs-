package Codingninja;
import java.util.Scanner;
import java.lang.Math;
public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of sides : ");
        double sides=sc.nextDouble();
        System.out.print("Enter the length of each side : ");
        double l=sc.nextDouble();
        double area=(l*l*sides)/(4*Math.tan(Math.PI/sides));
        System.out.println(area);
    }
}
