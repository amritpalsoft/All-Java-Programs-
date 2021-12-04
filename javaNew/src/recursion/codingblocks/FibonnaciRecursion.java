package recursion.codingblocks;

import java.util.Scanner;

public class FibonnaciRecursion {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        int answer=fib(n);
        System.out.println(answer);
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);      //fnm1=fib of n-1
        int fnm2=fib(n-2);      //fnm2=fib of n-2
        int fn=fnm1+fnm2;          //fn=fib of n
        return fn;
    }
}
