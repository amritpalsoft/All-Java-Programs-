/*here we are going to sort an array which only consist of 0, 1 and 2
*
* This problem is also called as 'Dutch National Flag'
*
* nd time complexity should be O(n) and space complexity  O(1)*/
package TimeAndSpaceComplexity;

public class SortArrayOf01And2 {
    public static void main(String[] args) {
        int[]array={0,0,1,0,2,1,0,2,1};
        int lo=0;
        int mid=0;
        int hi= array.length-1;

        while (mid<=hi){
            if (array[mid]==0){
                int temp=array[lo];
                array[lo]=array[mid];
                array[mid]=temp;
                lo++;
                mid++;
            }else if(array[mid]==1){
                mid++;
            }else {
                int temp=array[hi];
                array[hi]=array[mid];
                array[mid]=temp;
                hi--;
            }
        }
        for (int element:array) {
            System.out.print(element+" ");
        }
    }
}
