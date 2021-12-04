package CodeWith;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int [] arr={2,10,8,9,11,15,45};
       // arr[0]=2;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]) {
                System.out.println("sorted");
                break;

                //continue;
            //    System.out.println("s");
            }//else if(arr[i]>arr[i+1]) {
               // System.out.println("sorted");





        }
        //System.out.println("sorted");
    }
}
