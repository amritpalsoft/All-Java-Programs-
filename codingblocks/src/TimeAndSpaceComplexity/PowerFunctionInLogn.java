/*here we have to find x^n, we can find this by general for loop
* but the time complexity would be O(n)
*
* but we want to solve in O(log n) so we do by this way
*
* so for x^n, if n=odd then it can be written as [ x^(n/2) * x^(n/2) * x ]
* so for x^n, if n=even then it can be written as [ x^(n/2) * x^(n/2) ]
* so our time complexity become O(log n )*/

package TimeAndSpaceComplexity;

public class PowerFunctionInLogn {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int pnb2=power(x,n/2); //pnb2 means power of x^(n/2)
        if (n%2==1){   //means odd
            return pnb2*pnb2*x;
        }else {   //else even
            return pnb2*pnb2;
        }
    }
}
