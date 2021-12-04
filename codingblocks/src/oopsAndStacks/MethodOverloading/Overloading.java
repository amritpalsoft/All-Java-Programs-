/*Method Overloading means there are two functions of same name
* but they differ either on the no of arguments
* or the type of arguments
*
* two functions cannot overload on the basis of return type
* i.e. all the things are same, but only return type differ*/

package oopsAndStacks.MethodOverloading;

public class Overloading {
    public static void main(String[] args) {

        System.out.println(sum(4,5));

        System.out.println(sum(4,5,6));

        System.out.println(sum(2.3,5,4.2));

        System.out.println(sum(4,5,8,6,4));

    }
    //it takes twi integer type arguments
    public static int sum(int a, int b){
        return a+b;
    }
    //it take 3 integer type arguments
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //it takes 3 double type arguments
    public static double sum(double a, double b, double c){
        return a+b+c;
    }

    //it can take any no of arguments
    // this ...args is actually an array
    //i.e. we can also pass an  array here
    public static int sum(int...args){
        int answer=0;
        for (int element:args) {
            answer +=element;
        }
        return answer;
    }
}
