package basics.codingblocks;
import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nst=1;
        int nsp=n-4;
        int row=1;
        //no of rows
        while (row<=n){
            //spaces work
            int csp=1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            //star work
            int cst=1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            //preparation
            System.out.println();
            if(row<=(n/2)){
                nst=nst+2;
                nsp=nsp-1;
            }else{
                nst=nst-2;
                nsp=nsp+1;
            }
            row=row+1;
        }
    }
}
