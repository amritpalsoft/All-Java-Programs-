/*when we create string jvm check in Intern pool of heap whether the string is
* present or not, and if present then it returns the address of string
*
* But hen we create String using new keyword then it does not checks it
* and directly creates a new string a different address
*
* */

package stringbuilder.codingblocks;

public class StringDemoEquals {
    public static void main(String[] args) {
        String s1="amrit";
        String s2=s1; //here s2 contains the same address as that of s1
        System.out.println(s2==s1);  //both have same address, so result is true

        String s3=new String("amrit");

        System.out.println(s3==s1); //result is false, bcz they contains different address

        System.out.println(s3.equals(s1));//but when e compare using .equals then it results true
        //bcz .equals check the content in the string not address.
    }
}
