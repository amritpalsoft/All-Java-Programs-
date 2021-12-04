/*in linear search the complexity is O(n)*/
package function1Darray.codingblocks;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] array={5,15,3,4,88,95};
        System.out.println(linearSearch(array,88));
    }
    public static int linearSearch(int[]arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item)
                return i;
        }
        return -1;
    }
}
