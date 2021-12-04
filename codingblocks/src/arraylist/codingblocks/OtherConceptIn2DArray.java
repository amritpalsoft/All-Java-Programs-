/*in 2D Array each array contain another array
*int[][]arr=new int[][3]  this is wrong because size of first index is not given
* and it will give nulPointer Exception
* int[][]arr=new[3][] this is acceptable
* When we create a 2D Array then first bracket [] will give us a 1D Array which will
* stores the address location of another array*/



package arraylist.codingblocks;

public class OtherConceptIn2DArray {
    public static void main(String[] args) {

//      int[][]arr=new int[][3]; //this line will give error

        //this will create an array of size 3, and all the indexes will have value null bcz
        //we didnt specified second bracket []
        int[][]arr=new int[3][];

        System.out.println(arr);
        System.out.println(arr[0]);  //prints null
        System.out.println(arr[1]);  //prints null
        System.out.println(arr[2]);  //prints null

        arr[0]=new int[3]; //we created an array of size 3 on index 0, now index 0
        //will store adress of this array
        System.out.println(arr[0]);
        System.out.println(arr[0][2]);

        arr[1]=new int[5]; //we created an array of size 5 on index 1, now index 1
        //will store adress of this array


        arr[2]=new int[4]; //we created an array of size 4 on index 2, now index 2
        //will store adress of this array

        arr[0][2]=5;

        System.out.println(arr[4]);  //this will give index out of bound exception
          //bcz we created array of size arr[3] only



    }
}
