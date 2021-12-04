package basics.codingblocks;
import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=3;
        int nsp=1;
        int row=1;
        //no of rows
        while (row<=n){
            //star work
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            //spaces work
            int csp=1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            //star work
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            //preparation
            System.out.println();
            if(row<=(n/2)){
                nst=nst-1;
                nsp=nsp+2;
            }else {
                nst=nst+1;
                nsp=nsp-2;
            }
            row=row+1;
    }
    }
}
