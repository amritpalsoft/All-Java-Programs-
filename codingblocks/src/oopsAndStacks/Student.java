/*In this we are going to study Static & Final Keywords
*Once a variable is defined as final, means its value cant be changed
*
* Static variable or function means these are the properties of class
* not objects
* */

package oopsAndStacks;

public class Student {
     private static  int rollNo ;

     public Student(int rollNo) {
          Student.rollNo=rollNo;
     }

     public int getRollNo() {
          return rollNo;
     }


}
