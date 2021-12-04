/* In Java their is a precedence and associativity
Precedence means some operators have more value than others like multiplication and
division are more valuable than plus and minus
Similarly when there are two operators with same same precedence then we decide their
associaivity like from left to right
CODE WITH TUTORIAL 9 ME LIKHA HAI
 */
package com.amrit;
import java.util.Scanner;
public class OperatorPrecedenceAndAssociativity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1");
        float a=sc.nextFloat();
        System.out.println("Enter 2");
        float b=sc.nextFloat();
        System.out.println("Enter 3");
        float c=sc.nextFloat();
        float result=((b*b)-(4*a*c))/(2*a);
        System.out.println("The final result is "+ result);

    }
}
