/*Here we created an obj from Child class, and as Child class is inheriting from Parent class
* so our loader will load both Child And Parent class in heap
* we have variable b both in child and parent class so our JVM will prints b of Child class bcz
* reference is Child type
* and also we have function 'func()' both in Child and Parent Class
* so JVM will prints func() of child class bcz new keyword is with Child class */
package oopsAndStacks.Inheritence;

public class Client2 {
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.b);
        System.out.println(obj.d);
        System.out.println(obj.a);
        obj.func();
        obj.func1();
        obj.func2();
    }
}
