package basics.codingblocks;
import java.util.Scanner;
public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nst=1;
        int nsp=n-1;
        int row=1;
        int val=1;

        while (row<=n){
            int csp=1;
            while (csp<=nsp){
                System.out.print(" "+"\t");
                csp++;
            }
            int cst=1;
            while (cst<=nst){
                System.out.print(val+"\t");
                cst++;
                val++;
            }
            System.out.println();
            nsp=nsp-1;
            nst=nst+2;
            row=row+1;
        }
    }
}
