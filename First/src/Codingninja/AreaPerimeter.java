package Codingninja;
import java.util.Scanner;
import java.lang.Math;
public class AreaPerimeter {
    public static void main(String[] args) {
        float radius;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius=sc.nextFloat();
        double area=Math.PI*radius*radius;
        double perimeter=2*Math.PI*radius;
        System.out.println("The area of circle is " +area);
        System.out.println("The perimeter of circle is "+ perimeter);
    }
}
