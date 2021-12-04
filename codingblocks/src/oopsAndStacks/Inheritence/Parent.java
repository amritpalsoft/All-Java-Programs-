//here we created a package inside package
//i.e. Inheritance Package inside oopsAndStacks Package
/*let u assume that we created a class 'parent' in which there are some
* variable and functions are there, but now we want to change some of the functions
* or variables keeping all other things same
* Then this can be done by copying the code, but it will create redundancy of the
* code so we don't prefer this way, instead we prefer Inheritance
* i.e. we create a Child class which contains all properties of Parent Class
* and also some extra functions and variables  */

package oopsAndStacks.Inheritence;

public class Parent {
    int a=10;
    int b=100;
    public  void func(){
        System.out.println("hello from func Parent");
    }
    public  void func1(){
        System.out.println("hello from func1 Parent");
    }
}
