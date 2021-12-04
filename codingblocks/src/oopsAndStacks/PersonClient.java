/*In this code we are going to make Objects with the help of Person class
*
* Whenever we want to make Object we have to use 'new' keyword
* So whenever an object is created, it gets created on Heap
* and a reference is stored in Stack
* As an object is created default values of that data-type is stored in that object */

package oopsAndStacks;

public class PersonClient {
    public static void main(String[] args) {
        Person p1=new Person(); //p1 object made through help of Person class
        Person p2=new Person(); //p2 object made through help of Person class

        System.out.println(p1);  //it prints memory address of p1 on heap
        System.out.println(p2);  //it prints memory address of p2 on heap

        System.out.println(p1.name); //it prints null, bcz we didn't set any value
        System.out.println(p1.age); //it prints 0

        p1.name="Amrit Pal";
        p1.age=27;

        System.out.println(p1.name);
        System.out.println(p1.age);

        p2.name="Amit";
        p2.age=27;
    }
}
