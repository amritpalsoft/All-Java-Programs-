/*Bubble,Selection and Insertion Sort are based on the principle of iteration
* but Merge Sort is based on Recursive approach
* Merge Sort is based on principle of merging two sorted array
* here we are using two function mergeSort and mergeTwoSortedArray
* in mergeSort function we are giving our whole array and it is dividing
* the array in two parts and then by recursion make two sorted array
* And then we are passing these two sorted array in mergeTwoSortedArray function
* which then returns a completely sorted array
*
* Merge Sort is  basically a Divide and Conquer Algorithm i.e. it divides an array into
* two smaller parts, and then further into smaller parts until dividing is not possible
*
* There are two types of sorting algorithm
* i. inplace sorting algo
* ii. no inplace
*
* if the sorting takes place in such a manner that changes takes place in original array
* then it is called as inpalce sorting
* ex. bubble sort, selection sort, insertion sort
*
* but in place no changes are done in original array but a new array is created thats why
* it is no-inplace sorting  */



package TimeAndSpaceComplexity;

public class MergeSort {

    public static void main(String[] args) {

       int[]array={2,4,7,2,7,11,13,5,10};

       int[]answer= mergeSort(array,0, array.length-1);

        for (int element:answer) {
            System.out.println(element);
        }
    }
    //this function will merge two sorted array
    public static int[] mergeTwoSortedArray(int[]arr1,int[]arr2){

        int[]merged=new int[arr1.length+ arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< arr1.length && j< arr2.length){
            if (arr1[i]<=arr2[j]){
                merged[k]=arr1[i];
                i++;
                k++;
            }else {
                merged[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i== arr1.length){
            while (j< arr2.length){
                merged[k]=arr2[j];
                j++;
                k++;
            }
        }if (j== arr2.length) {
            while (i < arr1.length) {
                merged[k] = arr1[i];
                i++;
                k++;
            }
        }
        return merged;
    }

    public static int[] mergeSort(int[]arr,int lo,int hi){
        if(lo==hi){
            int[]br=new int[1];
            br[0]=arr[lo];
            return br;
        }
        int mid=(lo+hi)/2;
        int[] fh =mergeSort(arr,lo,mid);
        int[] sh =mergeSort(arr,mid+1,hi);

        int[]merge=mergeTwoSortedArray(fh,sh);
        return merge;
    }

}
