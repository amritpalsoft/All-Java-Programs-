package Codingninja;
import java.util.Scanner;
public class ToDecidePlaceOfService {
    public static void main(String[] args) {
        int age;
        char se;
        char marital;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : \n");
        age=sc.nextInt();
        System.out.print("Enter your sex : \n");
        se=sc.next().charAt(0);
        System.out.print("Enter your marital status : \n");
        marital=sc.next().charAt(0);
        if(se=='m'&&age>20&&age<40) {
            System.out.print("You can work anywhere\n");
        }else if(se=='m'&&age>40&&age<60) {
            System.out.println("Work in urban areas");
        }else if (se=='f') {
            System.out.println("Work in urban area only");
        }else{
            System.out.println("error");
        }
    }
}
