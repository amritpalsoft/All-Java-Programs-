package recursion.codingblocks;

public class RecursionBubbleSort {
    public static void main(String[] args) {
        int[] arr ={2,5,1,9,4,8};
        bubble(arr,0, arr.length-1);
        display(arr);
    }
    public static void bubble(int[]arr,int si,int li){  //si=starting index
        if(li==0){
            return;
        }
        if(si==li){
            bubble(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp=arr[si];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        bubble(arr,si+1,li);
    }
    public static void display(int []arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
