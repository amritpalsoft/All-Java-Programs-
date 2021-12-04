package com.amritpal;

public class Arrays {
    public static void main(String[] args) {
      // int []marks =new int[5];
     /*   int []marks;
        marks=new int[5];*/
        int[]marks={5,15,56,52,25};
        /*marks[0]=5;
        marks[1]=15;
        marks[2]=56;
        marks[3]=52;
        marks[4]=25;*/
        //System.out.println(marks[4]);
       /* for (int element:marks) {
            System.out.println(element);

        }*/
        for(int i=2;i< marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
