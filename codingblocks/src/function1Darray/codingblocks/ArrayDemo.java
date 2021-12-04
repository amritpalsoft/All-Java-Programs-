/*new keyword always gives memory in heap
Whenever we give size to an array it gets memory in heap and its reference
* is created in stack in Array name
* to set a value and get a value in an array it takes constant amount
* of time i.e set/get value takes O(1) */
package function1Darray.codingblocks;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array=null;
//        System.out.println(array); //as we have not told size of array so it prints null
        array=new int[5];
        System.out.println(array); //we tell size but not any input, so it prints base address
        System.out.println(array[0]); //it prints 0 bcz we didn't initialised any value

    }
}
