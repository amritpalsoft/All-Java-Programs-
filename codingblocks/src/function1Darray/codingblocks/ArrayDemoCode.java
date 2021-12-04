package function1Darray.codingblocks;

public class ArrayDemoCode {

    public static void main(String[] args) {
     //int array[]={96,85,12,55,22};    //array can also be defined in this way
      int arr[]=new int[5];
      arr[0]=96;
      arr[1]=85;
      arr[2]=12;
      arr[3]=55;
      arr[4]=22;
        System.out.println(arr.length);  //gives the length of array

      //  System.out.println(array[2]);
       /* for (int i=0;i<= arr.length-1;i++){
           System.out.println(arr[i]);
        }    */
        //enhanced for loop
        for (int element:arr){
            System.out.print(element+" ");
        }
    }
}
