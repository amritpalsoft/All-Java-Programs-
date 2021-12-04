package recursion.codingblocks;

public class PatternByRecursion {
    public static void main(String[] args) {
        pattern(5,0,0);
    }
    public static void pattern(int n,int row,int col){
        if(row==n){
            return;
        }
        if(col>row){
            System.out.println();
            pattern(n,row+1,0);
            return;
        }
        System.out.print("*\t");
        pattern(n,row,col+1);
    }
}
