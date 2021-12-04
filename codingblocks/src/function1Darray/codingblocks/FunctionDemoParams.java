/*This function takes input of parameters and prints the result
* a and b are called parameters and when we assign value to them then they are
* called as attributes */
package function1Darray.codingblocks;

public class FunctionDemoParams {
    public static void main(String[] args) {
        System.out.print("The sum is ");
        //function calling
        addition(8,9);
        System.out.println("hii");
        addition(10,20);
        System.out.println("bye");
    }
    //function
    public static void addition(int a,int b){
        int sum=a+b;
        System.out.println(sum+".");
    }
}
