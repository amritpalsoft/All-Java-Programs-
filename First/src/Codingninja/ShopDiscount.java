package Codingninja;
import java.util.Scanner;
public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quantity;
        int price=100;
        System.out.print("Enter the quantity : ");
        quantity= sc.nextInt();
        int total=price*quantity;
        float discuntedprice;
        if(total>1000) {
            discuntedprice = price *quantity * (.9f);
            System.out.println("Your discounted bill in Rs is : "+ discuntedprice);
        }else{
            int finalprice=total;
            System.out.println("Your bill in Rs is :"+ finalprice);
        }
    }
}
