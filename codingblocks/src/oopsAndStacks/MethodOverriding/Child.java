/*in this we are over-riding function fun from parent class
*the name of functions should be exactly same
*  */

package oopsAndStacks.MethodOverriding;

public class Child extends Parent{

    @Override
    public void fun(){
        System.out.println("hello from child");
    }
}
