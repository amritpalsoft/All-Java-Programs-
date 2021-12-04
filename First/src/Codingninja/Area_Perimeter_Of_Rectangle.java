package Codingninja;
import java.util.Scanner;
public class Area_Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float h;
        float w;
        System.out.print("Enter the height of rectangle : ");
        h= sc.nextFloat();
        System.out.print("Enter the width of rectangle : ");
        w=sc.nextFloat();
        float area=w*h;
        float perimeter=2*(w+h);
        System.out.println(area);
        System.out.println(perimeter);
    }

}
