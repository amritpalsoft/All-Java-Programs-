/*There are 3 sorting algo
* i. Bubble Sort: after every count one element is placed at correct position
* ii. SelectionSort: after every count, element at counter index gets placed at correct position
* iii. Insertion Sort:after every count, element upto that index gets at correct position */
package function1Darray.codingblocks;

public class ArrayInsertionSort {
    public static void main(String[] args) {
        int []array={2,7,4,11,55};
        insertionSort(array);
        display(array);

    }
    public static void insertionSort(int[]arr){

        for (int counter=1;counter<= arr.length-1;counter++){

            int val=arr[counter];

            int j=counter-1;
            while (j>=0&&arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
    public static void display(int[]arr){
        for (int element : arr) {     //enhanced for loop
            System.out.print(element + " ");
        }
    }
}
