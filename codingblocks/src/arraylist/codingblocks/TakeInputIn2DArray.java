package arraylist.codingblocks;
import java.util.Scanner;
public class TakeInputIn2DArray {
    public static void main(String[] args) {
        int[][] array=takeInput();
        System.out.println(array[2][2]);

    }
    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=sc.nextInt();
        int[][]arr=new int[rows][];
        for (int row=0;row<rows;row++){
            System.out.println("Enter the no of columns for row"+row);
            int cols=sc.nextInt();
            arr[row]=new int[cols];
            for ( int col=0;col<cols;col++){
                System.out.println("Enter the value for row"+row+"and column"+col);
                arr[row][col]=sc.nextInt();
            }
        }
        return arr;
    }
}
