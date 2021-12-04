/*A number is called prime if it is divisible by 1 and itself
* but we check for whether it is divisible by any other number or not
* 1,2,3,4...........,(n-1),n
* so we check from 2 to (n-1)*/

package basics.codingblocks;
import java.util.Scanner;

 public class Prime {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number= sc.nextInt();

        boolean prime=true;

        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                prime=false;
            }
        }
            if(prime){
            System.out.println("prime");
        }   else {
            System.out.println("not prime");
        }

    }
}
