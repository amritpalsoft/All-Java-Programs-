package recursion.codingblocks;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(6));
    }
    public static int Fact(int n){
     if(n==1){
         return 1;
     }
     int fn1=Fact(n-1);
     int fn=fn1*n;
     return fn;
    }
}
