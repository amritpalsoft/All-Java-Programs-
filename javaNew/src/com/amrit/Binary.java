package com.amrit;

public class Binary {
    public static void main(String[] args) {
        int[]array={4,5,8,9,12,19,27,38,48};
        int answer=binary(array,72);
        System.out.println(answer);
    }
    public static int binary(int[]arr,int no){
        int lo=0;
        int high= arr.length-1;
        while (lo<=high){
            int mid=(lo+high)/2;
            if(no<arr[mid]){
                high=mid-1;
            }else if(no>arr[mid]){
                lo=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
