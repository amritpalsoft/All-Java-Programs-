package recursion.codingblocks;

public class Recursion_Print_Decreasing_Increasing_Skip {
    public static void main(String[] args) {
        printDecreasingIncreasingSkip(5);
    }

    public static void printDecreasingIncreasingSkip(int n) {
        if (n == 0) {
            return;
        }
        if (n==5||n==3||n==1) {

            System.out.println(n);

            printDecreasingIncreasingSkip(n - 1);
        }else {
            printDecreasingIncreasingSkip(n - 1);
            System.out.println(n);
        }
    }
}