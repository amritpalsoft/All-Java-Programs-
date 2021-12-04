package basics.codingblocks;
import java.util.Scanner;
public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nst=1;
        int nsp=n-1;
        int row=1;
        int val;

        while (row<=n){
            val=row;
            int csp=1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst=1;
            while (cst<=nst){
                System.out.print(val+" ");
                cst++;
            }
            System.out.println();
            nsp=nsp-1;
            nst=nst+2;
            row=row+1;
        }
    }
}
