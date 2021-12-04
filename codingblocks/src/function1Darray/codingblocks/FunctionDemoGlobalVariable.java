/*When we define variable inside method it is local variable
* and when we define it inside class but outside method then it is Global Variable
* local variable is only accessible to the method in which it is defined
* but global variable is accessible to all methods in the class
* Global variable will be created in Heap.
* Variable created inside blocks(ex if block) are not accessible outside blocks
* But variable created outside blocks are accessible inside blocks */
package function1Darray.codingblocks;

public class FunctionDemoGlobalVariable {
  //this is a global variable bcz it is written inside class and not inside method/function
    //and for global variable we have to write like this s below
   public  static int a=10;
    public static void main(String[] args) {
        System.out.println(a);   //here global variable will print
        int a=100;
        System.out.println(a); //here local variable prints , in competition between local and global , local variable wins
        System.out.println(FunctionDemoGlobalVariable.a); // and if we want to print only global variable ,then we we have to write class name

    }
}
