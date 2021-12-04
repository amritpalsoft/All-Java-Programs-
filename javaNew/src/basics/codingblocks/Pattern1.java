/*
* In every pattern question there are three steps
* First: We have to decide the no of rows.
* second: We have to determine the work to be done in each row.
* Third: Preparation for the next row.
* Here no of rows <n
* then work is multiple no of stars in each row
* and then moving to next row
* */

package basics.codingblocks;
import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                System.out.print("* "+" ");
            }
                System.out.println();
        }
    }
}
