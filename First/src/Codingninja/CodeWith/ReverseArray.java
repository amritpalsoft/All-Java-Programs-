package CodeWith;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={1,22,3,45,55,89};
        int l= arr.length;
        int temp ;
        int n=Math.floorDiv(arr.length, 2);
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr){
            System.out.print(element);
            System.out.print(" ");
        }
    }
}
