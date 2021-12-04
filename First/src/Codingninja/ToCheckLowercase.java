package Codingninja;
import java.util.Scanner;
public class ToCheckLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        if(a>=97&&a<=123) {
            System.out.println("lower case ");
        }else if(a>=65&&a<=96) {
            System.out.println("Upper case");
        }else{
            System.out.println("it a number");


        }
    }
}
