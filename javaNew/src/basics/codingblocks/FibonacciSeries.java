/*A Fibonacci series starts with 0 and 1
* 0 as the zeroth fibonacci and 1 as the first fibonacci and second fibonacci is
* obtained by adding previous two series
* 0 1 1 2 3 5 8 13 .....*/
package basics.codingblocks;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int i=0;

        while(i<=(n)){
            System.out.println(a);
          int  sum=a+b;
          a=b;
          b=sum;
          i++;
        }
    }
}
