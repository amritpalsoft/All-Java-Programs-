/*Bubble sort is putting all element in array in sorted manner
* Sorting can be done either in ascending order or descending order*/
package function1Darray.codingblocks;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int []array={113,78,66,95,44,103};
        bubbleSort(array);
        display(array);

    }
    public static void bubbleSort(int[]arr){
        for(int counter=0;counter< arr.length-1;counter++){
            for (int j=0;j< arr.length-1-counter;j++){
                if(arr[j]<arr[j+1]) {  //if we put > sign then it sorts in ascending order, and for < sign in descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                }

        }
    }
    public static void display(int[]arr){
        for (int element : arr) {     //enhanced for loop
            System.out.print(element + " ");
        }
    }
}
