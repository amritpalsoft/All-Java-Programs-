/*sum=0       0
  123456%10=6   0+(6*10)
  12345%10=5
  1234%10=4
  123%10=3
  12%10=2
  1%10=1
  0
* */

package basics.codingblocks;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int answer=0;

        while (number !=0){
            int remainder=number%10;

            answer=answer*10+remainder;

            number=number/10;
        }
            System.out.println(answer);
    }
}
