package basics.codingblocks;
import java.util.Scanner;
public interface Patternn5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nst=n;
        int nsp=0;
        int row=1;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst=1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            nsp=nsp+1;
            nst=nst-1;
        }
    }
}
