package com.amritpal;
import java.lang.Math;
public class ReverseArray {
    public static void main(String[] args) {
        int []arr={5,2,3,4,8,7};
        int n=Math.floorDiv(arr.length, 2);
        int l= arr.length;
        int temp;
        for(int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-1-i];
        arr[l-1-i]=temp;

        }
        for (int element:arr){
            System.out.print(element+" ");
        }
    }
}
