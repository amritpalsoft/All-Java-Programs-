package recursion.codingblocks;

public class IndexOfArray {
    public static void main(String[] args) {
       int[]arr={1,5,7,8,7,1,5};
        System.out.println(indexOfElement(arr,0,7));
    }
    public static int indexOfElement(int[]arr,int si,int data){
        if(si==arr.length){
           return -1;
        }
        if(arr[si]==data){
            return si;
        }else {
            int remainingArray=indexOfElement(arr,si+1,data);
            return remainingArray;
        }
    }
}
