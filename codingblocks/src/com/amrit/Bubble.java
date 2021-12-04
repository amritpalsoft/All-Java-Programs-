package com.amrit;

public class Bubble {
    public static void main(String[] args) {
        int[]array={22,45,26,12,35,41,9,5,7};
        sort(array);
        display(array);
    }
    public static void sort(int[]arr){
        for(int count=0;count< arr.length-1;count++){
            for(int j=0;j< arr.length-1-count;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void display(int[]arr){
        for (int element:arr) {
            System.out.print(element+" ");
        }
    }
}
