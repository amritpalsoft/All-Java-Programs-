package com.amritpal;

public class JavaMethods {
   static   int logic(int x,int y){
       /*if we do not write static in this method then we have to create object to call this method , because only static method can be called without creating object*/
        int z;
        if(x>=y){
            z=x+y;
        }else {
         z=x-y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=15;
        int b=10;
      //  JavaMethods obj=new JavaMethods();
        int c=logic(a,b);
        System.out.println(c);
    }
}
