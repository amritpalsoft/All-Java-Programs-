package function1Darray.codingblocks;
import java.util.Scanner;

public class DecimalToAnybase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int snum=sc.nextInt();           //snum=source number
        int db=sc.nextInt();            //db=destination base
        //function calling
        int answer=decimalToAnyBase(snum,db);
        System.out.println(answer);
    }

    //function
    public static int decimalToAnyBase(int snum,int db){
        int ans=0;
        int multiplier=1;      //multiplier is 1 because any number power zero is always 1
        while (snum!=0){
            int remainder=snum%db;
            ans=ans+multiplier*remainder;
            multiplier=multiplier*10;
            snum=snum/db;
        }
        return ans;
    }
}
