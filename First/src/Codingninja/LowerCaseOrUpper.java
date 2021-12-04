package Codingninja;
import java.util.Scanner;
public class LowerCaseOrUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter the number");
        a=sc.nextInt();
        if(a<0) {
            System.out.println(-a);
        }else{
            System.out.println(+a);

        }

    }
}
