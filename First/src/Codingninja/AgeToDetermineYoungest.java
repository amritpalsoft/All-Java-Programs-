package Codingninja;
import java.util.Scanner;
public class AgeToDetermineYoungest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age1;
        int age2;
        int age3;
        System.out.print("Enter age of Ram : ");
        age1= sc.nextInt();
        System.out.print("Enter age of Shyam : ");
        age2=sc.nextInt();
        System.out.print("Enter age of Sita : ");
        age3= sc.nextInt();
        if(age3>age1&&age2>age1){
            System.out.println("ram is youngest");
            if(age3>age2){
                System.out.println("sita is oldes");

            }else {
                System.out.println("Shyam is oldest");
            }
        }else if(age1>age2&&age3>age2){
            System.out.println("Shyam is youngest");
            if(age1>age3){
                System.out.println("ram is oldest");
            }else {
                System.out.println("Sita is oldest");
            }
        }else if(age1>age3&&age2>age3){
            System.out.println("Sita is Youngest");
            if(age1>age2){
                System.out.println("ram is oldest");

            }else {
                System.out.println("Shyam is oldest");
            }
        }

    }
}
