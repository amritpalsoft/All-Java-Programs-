/* Quick sort is also Divide and Conquer Sorting Algo
* in this we divide our array on the pivot point
* and after that we sort our divided array recursively
* in Quick Sort all changes will be made in the original Array
*
* in quick-sort when we break array in two part at point point
* then we make sure that all element to left of pivot point should be less
* than element at pivot, and all element at right should be greater than than element at
* pivot point
*
* and in the similar manner we break the array at pivot point until lo>=hi */
package TimeAndSpaceComplexity;

public class QuickSort {
    public static void main(String[] args) {
        int[]array={2,1,5,3,7,6,13,11,43,25};
        quickSort(array,0, array.length-1);
        for (int element:array) {
            System.out.println(element);
        }
    }
    public static void quickSort(int[]arr,int lo,int hi){
        if (lo>=hi){
            return;
        }
        //partitioning
        int mid=(lo+hi)/2;
        int pivot=arr[mid];

        int left=lo;
        int right=hi;

        while (left<=right){
            while (arr[left]<pivot){
                left++;
            }
            while (arr[right]>pivot){
                right--;
            }
            if (left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
        }
        quickSort(arr,lo,right);
        quickSort(arr,left,hi);
    }
}
