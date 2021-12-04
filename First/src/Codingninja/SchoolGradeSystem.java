package Codingninja;
import java.util.Scanner;
public class SchoolGradeSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("enter your marks : ");
        marks=sc.nextInt();
        if(marks<25) {
            System.out.println("Your Grade is F");
        }else if(marks>=25&&marks<45){
            System.out.println("Yoyr Grade is E");

        }else if(marks>=45&&marks<50){
            System.out.println("Your Grade is D");
        }else if(marks>=50&&marks<60){
            System.out.println("Your Grade is C");
        }else if(marks>=60&&marks<80){
            System.out.println("Your Grade is B");
        }else if(marks>=80&&marks<=100){
            System.out.println("Your grade is A");
        }else {
            System.out.println("Incorrect Marks");
        }
    }
}
