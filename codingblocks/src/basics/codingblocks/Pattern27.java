package basics.codingblocks;
import java.util.Scanner;

public class Pattern27 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nst=1;
        int nsp=n-1;
        int row=1;
        int val;


        while (row<=n){
            val=1;

            int csp=1;
            while (csp<=nsp){
                System.out.print(" "+"\t");
                csp++;
            }

            int cst=1;
            while (cst<=nst){
                System.out.print(val+"\t");
                if(cst<=(nst/2))
                    val++;
                else
                    val--;
                cst++;
            }

            System.out.println();
            nsp=nsp-1;
            nst=nst+2;
            row=row+1;
        }
    }
}
