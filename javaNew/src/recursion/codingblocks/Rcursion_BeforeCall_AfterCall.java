/*In this work is done both before recursive call and after recursive call
* */
package recursion.codingblocks;

public class Rcursion_BeforeCall_AfterCall {
    
    public static void main(String[] args) {
        printDecreasingIncreasing(5);
    }
    public static void printDecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}
