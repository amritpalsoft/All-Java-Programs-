package com.amrit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
//	int sum=((n+1)*n)/2;
     //   System.out.println(sum);
        int sum=0;
      //  int counter=1;
        for(int counter=1;counter<=n;counter++){
            sum=sum+counter;
            //counter=counter+1;
        }
        System.out.println(sum);
    }
}
