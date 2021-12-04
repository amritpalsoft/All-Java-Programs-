/*In recursion a function calls itself
* Base condition is the condition at which my function should stop otherwise
* it would cause a infinite loop
* in this case our base case is n=0
* so we included 'if' condition in function
* This function first prints 'n' and then calls for recursion
* So in this case first work in function is done then calling
* So stack building is done after work*/

package recursion.codingblocks;

public class Recursion_StackIsBuilding {

    public static void main(String[] args) {

        printDecreasing(5);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);  //a function calling itself
    }
}
