/*HCF also called as GCD(greatest common divisor)
When we divide a number, the remainder becomes next divisor and the first divisor become
* dividend and this goes on til  the remainder becomes zero*/
package basics.codingblocks;
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int divisor =  sc.nextInt();
        int dividend = sc.nextInt();

            while (dividend % divisor != 0) {
            int remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;


        }
             System.out.println(divisor);
    }
}
