/*JVM have a special class Loader which checks whether our class is dependent on some
* another class, and if there is some dependency then it will load all the content
* of that class in heap memory */
/*when we write 'Parent obj = new Parent()'
* here obj==>reference in which address is stored
* and the location at heap in which all variable are stored is 'instance' of that obj */
/*There ar e 4 cases
*
* *reference*     *instance*
* Parent        Parent
* Parent        Child
* Child         Parent
* Child         Child
*
* Whenever we writes code, command is in the hand of compiler
* and compiler sees from left to right
*
* And whenever our code executes then command is in the hands of JVM and it sees
* from right to left*/

/*whe the program starts executing
* then variables are resolved on the basis of Reference
* i.e. as in case 2 , we have b both in Parent & Child, so how to decide whether
* prints b=200 or b=100
* So this is decided on reference as Parent obj2 = new Child()
* so reference is Parent so b=100 will be printed
*
* but Functions are resolved in different manner
* i.e. JVM first checks function in which new keyword is there
* i.e Parent obj2= new Child() so new is with child() so first it check Child class
* here func() is both in child & parent class
* but it prints func() of Child class  */
package oopsAndStacks.Inheritence;

public class Client {
    public static void main(String[] args) {

        System.out.println("--Case 1--");


        Parent obj=new Parent();

        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.func();
        obj.func1();

        System.out.println("--Case 2--");

        Parent obj2=new Child();

        System.out.println(obj2.a);
        System.out.println(obj2.b);
        //when we write code compiler sees from left
        //so compiler assumes obj2 of Parent Type
        //so when we write obj2.d it gives error bcz d is not in Parent class
        //so to remove this error we typecast obj2.d to child type
//        System.out.println(obj.d);
        System.out.println(((Child)obj2).d);   //typecasted to child
        obj2.func();
        obj2.func1();
        ((Child) obj2).func2();

        System.out.println("--Case 3--");

        //this case is not allowed
        // we cant create child refernce and parent instance
//        Child obj3=  new Parent();

        System.out.println("--Case 4--");

        Child obj4=new Child();
        System.out.println(obj4.a);
        System.out.println(obj4.b);  //it will print b=200, bcz reference is of child type
        System.out.println(obj4.d);
        obj4.func();  // prints func of child class, bcz new is with Child class
        obj4.func1();
        obj4.func2();



    }
}
