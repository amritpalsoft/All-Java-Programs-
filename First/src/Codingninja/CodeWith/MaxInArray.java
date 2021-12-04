package CodeWith;

public class MaxInArray {
    public static void main(String[] args) {
        int [] no={5,10,-15,425,30,44,56,66};
        int max=Integer.MIN_VALUE;
        for(int i=0;i< no.length;i++){
            if(no[i]>max){
                max=no[i];
            }
        }
        System.out.println("The max number is "+max);
    }
}
