package function1Darray.codingblocks;
import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int snum=sc.nextInt();       //snum=source number
        int sb= sc.nextInt();       //sb=source base
        int res=anyBaseToDecimal(snum,sb);  //res=result
        System.out.println(res);
    }

    public static int anyBaseToDecimal(int snum,int sb) {
        int ans=0;
        int multiplier=1;
        while (snum!=0){
            int remainder=snum%10;    //here we are dividing by 10 bcz we are converting to decimal base
            ans=ans+(multiplier*remainder);

            multiplier=multiplier*sb;
            snum=snum/10;

        }
        return ans;
    }
}
