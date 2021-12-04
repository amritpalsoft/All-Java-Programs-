package basics.codingblocks;
import java.util.Scanner;

public class Pattern32 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int nr=2*n-1;
        int row=1;
        int val;
        //no of rows
        while (row<=nr){
            if(row<=nr/2+1) {
                val = row;
            }else {
                val=nr-row+1;
            }
            int cst=1;
            //star work
            while (cst<=nst){
                if(cst%2!=0) {
                    System.out.print(val + " ");
                }else{
                    System.out.print("*"+" ");
                }
                    cst++;
            }
            //preparation
            System.out.println();
            if(row<=(n-1)){
                nst=nst+2;
            }else {
                nst=nst-2;
            }
            row=row+1;
        }
    }
}
