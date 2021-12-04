/*we have created a method to which we are calling
* variables created in two different functions are not accessible to each other
* it means we can create two variables of same name in two different functions
*  */
package function1Darray.codingblocks;

public class FunctionDemoReturnValue {

    public static void main(String[] args) {

        System.out.print("The sum is: ");

       int answer= addition(4,5);          //method calling

        System.out.println(answer);
    }

    //method created
    public static int addition(int a,int b){     //method called
        int sum=a+b;                             // int a, int b are parameters and value assigned to them are attributes.
        return sum;
    }
}
