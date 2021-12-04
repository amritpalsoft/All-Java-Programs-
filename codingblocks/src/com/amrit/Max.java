package com.amrit;

public class Max {
    public static void main(String[] args) {
//        int[] arr=new int[5];
        int[] arr={100,20,30,40,50};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
