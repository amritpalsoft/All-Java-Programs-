package function1Darray.codingblocks;

public class ArrayMax {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int[] array={1200,15,5,0,800,20,45,66,78,23,1000};
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println(max);
    }
}
