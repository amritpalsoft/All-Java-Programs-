/*We can directly convert string builder to string
* BUt string cant be directly converted to string builder
* Actually we can pass our string to string builder
* ex. String s="Hello"
*     String Builder sb=new String Builder(s)
*     (so in above case we passed String s to String Builder)
* We cant directly create String Builder from Scanner
* so first we take input in string and then we pass string to string builder*/
package stringbuilder.codingblocks;
import java.util.Scanner;
public class Sb_StringConversion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        String s=sb.toString();   //string builder converted to string
        System.out.println(s);
    }
}
