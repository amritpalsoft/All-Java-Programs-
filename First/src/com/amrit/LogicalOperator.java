/* Here we are using logical operator
&& is 'And' operator:Both value should be true for true result.
|| is 'Or'  operator:Atleast one value should be true for true result.
 */
package com.amrit;
import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1");
        int a=sc.nextInt();
        System.out.println("Enter 2");
        int b=sc.nextInt();
        System.out.println("Enter 3");
        int c= sc.nextInt();
        System.out.println("The Result is "+ ((a>=b)||(a>c)));
        System.out.println("The Result is "+ ((a>=b)&&(a>c)));

    }
}
