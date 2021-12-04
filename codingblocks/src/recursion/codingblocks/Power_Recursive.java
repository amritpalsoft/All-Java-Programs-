package recursion.codingblocks;

public class Power_Recursive {
    public static void main(String[] args) {
        System.out.println(Power(2,5));
    }
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        int pn1=Power(x,n-1);  //pn1  means x power n-1
        int pow=x*pn1;  //power =x * x power n-1
        return pow;
    }
}
