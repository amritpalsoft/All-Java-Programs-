/*Strings are created in Intern pool of heap
* but String Builder are created in Heap only
* in string we cannot update or insert new char in string
* but in string builder these properties are available*/
package stringbuilder.codingblocks;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb);
        sb.insert(2,"def");
        System.out.println(sb);
        sb.setCharAt(4,'d');
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb                  );
    }
}
