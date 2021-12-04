/*In this as we call 'printIncreasing' function from main function
* it would call another recursive function inside it
* and this process continues till our base condition is met
* And as the base condition is met it return to last function and work
* of printing 'n' is done and continues until
* all function are removed from stack
* So in this case we are doing work when stack is falling*/
package recursion.codingblocks;

public class Recursion_StackIsFalling {

    public static void main(String[] args) {
        printIncreasing(5);
    }

    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);

    }
}
