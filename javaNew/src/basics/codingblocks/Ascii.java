package basics.codingblocks;
import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.printf("The ASCII Value of %c is %d",ch,(int)ch);
        System.out.println();
        System.out.println(ch);
        System.out.println((int)(ch));
    }
}
