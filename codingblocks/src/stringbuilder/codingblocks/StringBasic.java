package stringbuilder.codingblocks;

public class StringBasic {
    public static void main(String[] args) {
        String str="amrit";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(1,3));
        System.out.println("*****************");
        System.out.println(str.substring(2));

        String str2="pal";
//        String str3=str+" "+str2;
        String str3=str.concat(" "+str2);
        System.out.println(str3);

        System.out.println(str.indexOf("m"));

        System.out.println(str.startsWith("am"));
       String s4=new String("hello");
        System.out.println(s4);


    }
}
