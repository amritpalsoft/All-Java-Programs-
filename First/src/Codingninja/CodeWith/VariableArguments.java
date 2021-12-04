package CodeWith;

public class VariableArguments {
    static int sum(int x,int ...arr) {
        int result = x;
        for (int a : arr)
            result += a;
        {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,8,9,10));
        System.out.println(sum(4,5,88,12,15,44));
        System.out.println(sum(4,5,1));
    }

    }
