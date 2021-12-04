package CodeForces;
import java.util.Scanner;
public class Prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the weight of watermelon");
        int weight=sc.nextInt();
        if((weight%2==0)&&weight>=1&&weight<=100){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }
    }
}
