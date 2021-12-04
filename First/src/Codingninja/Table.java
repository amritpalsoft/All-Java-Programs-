package Codingninja;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int no= sc.nextInt();
        int i;
        int product=1;
        for(i=1;i<=10;i++){
            int num=no*i;
            System.out.println(no+"*"+i+"="+num);

        }
    }
}
