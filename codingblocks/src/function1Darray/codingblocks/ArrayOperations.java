package function1Darray.codingblocks;
import java.util.Scanner;

public class ArrayOperations {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] array=takeInput();
       display(array);
        //System.out.println(array[2]);

    }
    public static int[] takeInput(){
        System.out.println("input the size of array");
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the value at index "+i);
            arr[i]= sc.nextInt();
        }
            return arr ;
    }
    public static void display(int[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

