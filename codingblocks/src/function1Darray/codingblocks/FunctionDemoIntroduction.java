/*
* function are used because they help in preventing to write same code again and again.
* */
package function1Darray.codingblocks;

public class FunctionDemoIntroduction {

    public static void main(String[] args) {
        System.out.println("hello");
       //function calling
        addition();           //method or function calling
        System.out.println("bye");

    }
    //function or method
    public static void addition(){    //this method is void because it is not returning any value
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println(sum);
    }
}