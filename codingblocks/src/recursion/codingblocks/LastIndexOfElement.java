/*in this program we are going to check
* the index at which an element is occurring at last*/
package recursion.codingblocks;

public class LastIndexOfElement {
    public static void main(String[] args) {
        int[]arr={2,4,8,11,4,5,4,2};
        System.out.println(indexOfElement(arr,0,2));
    }
    public static int indexOfElement(int[]arr,int si,int data){
        if(si== arr.length){
            return -1;
        }
        int index=indexOfElement(arr,si+1,data);
            if(index==-1){
                if(arr[si]==data){
                    return si;
                }else {
                    return -1;
                }
            }else{
                return index;
            }
        }
    }

