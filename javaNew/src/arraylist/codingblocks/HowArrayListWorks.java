/*arraylist is used because array is of fixed size but arraylist
* changes its size dynamically
* initially the size of arraylist is 2 and it gets doubled as we add more than 2 items
* when the size of arraylist is doubled it creates a new array at different location
* and then copies the previous elements  */

package arraylist.codingblocks;
import java.util.ArrayList;
public class HowArrayListWorks {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());

        list.add(10);         //to add an item to arraylist
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(3);    //40 is removed from arraylist
        System.out.println(list);
        System.out.println(list.get(3));   // to get element at a particular index
    }
}
