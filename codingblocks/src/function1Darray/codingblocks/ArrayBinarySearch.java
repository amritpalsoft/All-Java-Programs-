/*for binary search array must be sorted
* and the complexity ids log n(base2)*/
package function1Darray.codingblocks;

public class ArrayBinarySearch {

    public static void main(String[] args) {
        int [] array={1,5,9,11,18,27,45,55,85,92,102};
        System.out.println(binarySearch(array,18));
    }

    public static int binarySearch(int[]arr,int item){
        int lo=0;
        int high=arr.length-1;

        while (lo<=high){
            int mid=(lo+high)/2;
            if(item<arr[mid]){
                high=mid-1;
            }else if(item>arr[mid]){
                lo=mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
