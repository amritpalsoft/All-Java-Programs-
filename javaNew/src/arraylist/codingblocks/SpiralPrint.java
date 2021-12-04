/*for spiral print in clockwise direction we take 6 parameters
* top,right,bottom,left,count,direction*/

package arraylist.codingblocks;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][]arr={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        spiralclockwise(arr);

    }
    public static void spiralclockwise(int[][]arr){

        int top,bottom,right,left,count,direction;


        top=0;bottom=arr.length-1;left=0;
        right=arr[top].length-1;
        count=(bottom+1)*(right+1);
        direction=1;

        while(left<=right&&top<=bottom){
            if(count>0){
                if(direction==1){
                    for(int i=left;i<=right;i++){
                        System.out.println(arr[top][i]);
                        count--;
                    }
                    direction=2;
                    top++;
                }
            }
            if(count>0){
                if(direction==2){
                    for(int i=top;i<=bottom;i++){
                        System.out.println(arr[i][right]);
                        count--;
                    }
                    direction=3;
                    right--;
                }
            }
            if(count>0){
                if(direction==3){
                    for (int i=right;i>=left;i--){
                        System.out.println(arr[bottom][i]);
                        count--;
                    }
                    direction=4;
                    bottom--;
                }
            }
            if(count>0){
                if(direction==4){
                    for(int i=bottom;i>=top;i--){
                        System.out.println(arr[i][left]);
                        count--;
                    }
                    direction=1;
                    left++;

                }
            }
        }
    }
}
