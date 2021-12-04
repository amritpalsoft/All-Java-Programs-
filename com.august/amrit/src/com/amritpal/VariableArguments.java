package com.amritpal;

public class VariableArguments {
     static int sum(int ...arr){
        int result=0;
        for(int element:arr){
            result +=element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum is "+sum(4,5));
        System.out.println("The sum is "+sum(1));
        System.out.println("The sum is "+sum(4,5));
        System.out.println("The sum is "+sum(4,5,88,77));
        System.out.println("The sum is "+sum(4,5,9,8));
        System.out.println("The sum is "+sum(4,5,7,0,-1,-9));
    }
}
