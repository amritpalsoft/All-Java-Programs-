/*in wave print in one row moves from from left to right
* and in second row from right to left
*
* so we concluded that when row is even it is moving from left to right
* and when row is odd it is moving from right to left*/

package arraylist.codingblocks;

public class WavePrint {
    public static void main(String[] args) {
        int[][]arr={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        rowprint(arr);
    }
    public static void rowprint(int[][]arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]);
                }
            }else {
                for (int j=arr[i].length-1;j>=0;j--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
