/*
* In this pattern both stars and spaces to be printed.
* Bcz if spaces are before stars then they have to be printed
* But spaces after stars are not printed
* So here no of rows=n   actually would be given in question
* And the work is to first print spaces then stars
* initially we only see first row
* so in first row stars are 1, so initialise nst=1
* and spaces are 4, so initialise nsp=n-1
* */

package basics.codingblocks;
import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int nsp=n-1;        //nsp=no of spaces
        int nst=1;          //nst=no of stars

        //no of rows
        for(int row=1;row<=n;row++){

            //work for spaces
            for(int csp=1;csp<=nsp;csp++){              //csp=count of spaces
                System.out.print(" "+" ");
            }

            //work for stars
            for(int cst=1;cst<=nst;cst++){               //cst=count of stars
                System.out.print("*"+" ");
            }

            //preparation
            System.out.println();
            nsp=nsp-1;
            nst=nst+1;

        }
    }
}
