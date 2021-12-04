package ChallengeFundamentals;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%'){
            int N1=sc.nextInt();
            int N2=sc.nextInt();
            if(ch=='*'&&N1>=0&&N1<=100000000&&N2<= 100000000&&N2>=0){
                int result=N1*N2;
                System.out.println(result);
            }
            if(ch=='+'&&N1>=0&&N1<=100000000&&N2<= 100000000&&N2>=0){
                int result=N1+N2;
                System.out.println(result);
            }
            if(ch=='-'&&N1>=0&&N1<=100000000&&N2<= 100000000&&N2>=0){
                int result=N1-N2;
                System.out.println(result);
            }
            if(ch=='/'&&N1>=0&&N1<=100000000&&N2<= 100000000&&N2>0){
                int result=N1/N2;
                System.out.println(result);
            }
            if(ch=='%'&&N1>=0&&N1<=100000000&&N2<= 100000000&&N2>0){
                int result=N1%N2;
                System.out.println(result);
            }
        }else if(ch=='X'||ch=='x'){
            System.exit(0);
        }else{
            System.out.println("Invalid operation. Try again.");
        }


    }
}
