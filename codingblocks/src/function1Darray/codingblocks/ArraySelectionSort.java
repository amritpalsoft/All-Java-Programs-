package function1Darray.codingblocks;

public class ArraySelectionSort {
    public static void main(String[] args) {
        int[]array={25,48,12,66,52,98,70};
        selectionSort(array);
        display(array);
    }
    public static void selectionSort(int[]arr){
        for (int counter=0;counter<arr.length-1;counter++){
            int min=counter;
            for (int j=counter+1;j<= arr.length-1;j++){
                if(arr[j]<arr[min]) //puts array in ascending order
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[counter];
            arr[counter]=temp;
        }
    }
    public static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}}
