package basics.codingblocks;
import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nr=2*n-1;           //nr=no of rows
        int nst=1;              //nst=no of stars
        int row=1;
        //no of rows
        while(row<=nr){
            int cst=1;
            //star work
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            //preparation
            System.out.println();

           if(row<=(nr/2)){
            nst=nst+1;

        }else {
               nst=nst-1;
           }
            row=row+1;
        }
    }
}
