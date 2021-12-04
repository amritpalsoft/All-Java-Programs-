package Codingninja;
import java.util.Scanner;
public class TakeFloatingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        float num=sc.nextFloat();
        if(num==0) {
            System.out.println("zero");
        }else if(num<1&&num!=0) {
            System.out.println("small");
        }else if (num>1000000) {
            System.out.println("large");
        }else if(num>0) {
            System.out.println("positive");
        }else if(num<0){

        }

    }
}
