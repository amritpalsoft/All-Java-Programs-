package function1Darray.codingblocks;

public class ArrayDemoSwap1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int i=0,j=2;

        System.out.println(arr[i]+","+arr[j]);
        Swap(arr,i,j);
        System.out.println(arr[i]+","+arr[j]);
    }
    //non working swap bcz change occurs in local variable of Swap function but not in array
    public static void Swap(int one,int two){
        int temp=one;
        one=two;
        two=temp;
        System.out.println(one+","+two);
    }
    //working swap because changes are done in array
    public static void Swap(int[]arr,int i,int j){
        System.out.println(arr[i]+","+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println(arr[i]+","+arr[j]);
    }
}
