package basics.codingblocks;
import java.util.Scanner;
public class Prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int i=2;
        while(i<=(n-1)){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            i=i+1;


        }
    }
}
