package basics.codingblocks;
import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int nsp=0;
        int nst=n;
        //no of rows
        for(int i=1;i<=n;i++){
            //work for spaces
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            //work for stars
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            //preparation
            System.out.println();
            nsp=nsp+1;
            nst=nst-1;

        }
    }
}
