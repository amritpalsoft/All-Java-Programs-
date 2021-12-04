package com.amritpal;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int []arr={1,2,8,9,8,10,10,10};
        boolean isSorted=true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(!isSorted) {
            System.out.println("The array is not sorted");
        }else {
            System.out.println("sorted");
        }
    }
}
