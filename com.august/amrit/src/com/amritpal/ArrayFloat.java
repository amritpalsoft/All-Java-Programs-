package com.amritpal;
import java.util.Scanner;
public class ArrayFloat {
    public static void main(String[] args) {
       /*problem 1
        float[] array={41.2f,45.2f,55.6f,88.9f,47.3f};
        float sum=0;
        for(int i=0;i< array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);*/
        Scanner sc = new Scanner(System.in);
        int[] array = {47, 78, 96, 21, 44, 66, 25, 21, 45};
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean inArray=false;
        for(int element:array){
            if( element==num){
                inArray=true;
                break;
            }

            }if(inArray){
            System.out.println("present");

        }else {
            System.out.println("not present");
        }




    }
}

