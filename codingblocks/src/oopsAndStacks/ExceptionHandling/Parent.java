/*Exception Handling is used to handle the error if occurs
 * let us assume we have variable age, and we don't wnt that someone
 * gives input to age a negative integer then we can use exception handling
 *
 * but as an exception occurs our program gets terminated
 *
 * so if we don't want to get out of the program then we can use try/catch block
 * so if error occurs then try block handles it and immediately moves to
 * catch block , and remaining code proceeds*/

/*throw is used to disclose exception
*
* and try/catch is used to handle exception*/

package oopsAndStacks.ExceptionHandling;

public class Parent {
   private String name;
   private int age;

   public void setAge(int age) throws Exception{
       if (age<0){
           throw new Exception("age can't be negative");
       }
       this.age=age;
   }

   public void getAge(){
       System.out.println(age);
   }
}
