/*in java
*
*    noun  -> class
*    adjective -> data members
*    verb -> functions              */


/*if there is a exception in try block then lines in try block will
* not executes and lines in catch block gets executed
*
* and if there is no exception in try block then lines in catch block
* do not get executed*/
package oopsAndStacks.ExceptionHandling;

public class Child {
    public static void main (String[] args) throws Exception {
        Parent child1=new Parent();

        System.out.println("hello");

        try {
            child1.setAge(-27);
            System.out.println("after try");
        }

        catch (Exception e) {
            System.out.println("in catch");
        }

        child1.getAge();

        System.out.println("bye");

    }
}
