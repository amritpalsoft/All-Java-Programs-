package recursion.codingblocks;

public class SortedArrayOrNot {

    public static void main(String[] args) {
        int []arr={1,2,31,4,5};
        System.out.println( isSorted(arr,0));
    }
    public static boolean isSorted(int[]arr,int si){   //si=starting index
        if(si== arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }else {
           boolean restArray=isSorted(arr,si+1);
               return restArray;

        }
    }
}
