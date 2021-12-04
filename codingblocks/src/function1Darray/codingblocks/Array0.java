package function1Darray.codingblocks;
import java.util.Scanner;

public class Array0 {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int[] array=call();
        display(array);
    }
    public static int[] call(){
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the value for "+i+" index");
            arr[i]= sc.nextInt();

        }
        return arr;
    }
    public static void display(int[]array){
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
