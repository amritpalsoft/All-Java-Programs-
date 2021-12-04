/* methods of string
   1. toLowercase()  to convert all element in string to lower case
   2. toUppercase() to convert all element in string to upper case
   3. lenght() to calculate the length of string
 */
package com.amrit;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="AmRIt";
        int length=name.length();
        String lower=name.toLowerCase();
        String upper=name.toUpperCase();
        System.out.println(length);
        System.out.println(lower);
        System.out.println(upper);
        /* Here we are creating a new string named as 'amrit'
           so if a string have more spaces before and after it
           we can trim it by .trim() method
         */


        String amrit="    aaa   ";
        String trimmed=amrit.trim();
        System.out.println(trimmed);
      /* subsring method : in this method we use it to start after some characters
      in the string
      in substring(1) here it starts from 1 and goes to last
      but in substring(1,4) here it starts from 1 and goes to 3
       */
        String sub=name.substring(1,4);
        System.out.println(sub);
        /* replace string :

         */
        String rep=sc.nextLine();
        String replace=rep.replace('m','i');
        System.out.println(replace);
        /* starts with

         */
        String star=sc.nextLine();
        boolean startswith=star.startsWith("am");
        System.out.println(startswith);
        /* ends with

         */
        String end=sc.next();
        boolean endswith=end.endsWith("it");
        System.out.println(endswith);
        /* charAt()

         */
        System.out.println(end.charAt(2));
        /* index of

         */
        System.out.println(end.indexOf("rit",4));
        /* last index of()

         */
        System.out.println(end.lastIndexOf("it",4));

    }
}
