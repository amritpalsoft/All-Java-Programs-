package Codingninja;
import java.util.Scanner;
public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;
        length = sc.nextInt();
        breadth = sc.nextInt();
        if(length==breadth){
            System.out.println("it is a square");
        }
    }
}
