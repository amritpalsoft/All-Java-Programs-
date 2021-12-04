package com.amritpal;

public class MaxInArray {
    public static void main(String[] args) {
        int []arr={-44,-1169,-4458,44,12,88,64,22,13,888888888};
        int min=Integer.MAX_VALUE;
        for(int element:arr){
            if(element<min){
                min=element;
            }
        }
        System.out.println("The min element in  the array is "+min);
    }
}
